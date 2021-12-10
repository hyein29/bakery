package com.bakery.service;

import com.bakery.constant.Role;
import com.bakery.dto.MemberDTO;
import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import com.bakery.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService, UserDetailsService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public String save(MemberDTO dto) {

        String encodedPassword = passwordEncoder.encode(dto.getPassword());
        dto.setPassword(encodedPassword); // 비밀번호 암호화

        dto.setEnabled(true);

        Grade grade = new Grade(); // default 회원 등급 = 1
        grade.setGradeNo(1);
        dto.setGrade(grade);

        Member entity = dtoToEntity(dto);
        memberRepository.save(entity);

        return entity.getUsername();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 로그인을 하기 위해 가입된 user정보를 조회하는 메서드
        Optional<Member> memberEntityWrapper = memberRepository.findByUsername(username);
        Member entity = memberEntityWrapper.get();

        List<GrantedAuthority> authorities = new ArrayList<>();

        // username이 'admin'이면 admin권한 부여
        if("admin".equals(username)) {
            authorities.add(new SimpleGrantedAuthority(Role.ADMIN.getValue()));
        }else {
            authorities.add(new SimpleGrantedAuthority(Role.MEMBER.getValue()));
        }

        // 아이디, 비밀번호, 권한리스트를 매개변수로 User를 생성해 반환해준다.
        return new User(entity.getUsername(), entity.getPassword(), authorities);
    }
}
