package com.bakery.service;

import com.bakery.dto.MemberDTO;
import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import com.bakery.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService{

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


}
