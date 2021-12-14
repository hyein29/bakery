package com.bakery.service;

import com.bakery.dto.AuthorityDTO;
import com.bakery.dto.CartDTO;
import com.bakery.dto.MemberDTO;
import com.bakery.entity.Authority;
import com.bakery.entity.Cart;
import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import com.bakery.mapper.AuthorityMapper;
import com.bakery.mapper.CartMapper;
import com.bakery.mapper.MemberMapper;
import com.bakery.repository.AuthorityRepository;
import com.bakery.repository.CartRepository;
import com.bakery.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    AuthorityRepository authorityRepository;

    @Autowired
    AuthorityMapper authorityMapper;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    CartMapper cartMapper;

    @Transactional
    @Override
    public String save(MemberDTO memberDTO) {

        String encodedPassword = passwordEncoder.encode(memberDTO.getPassword());
        memberDTO.setPassword(encodedPassword); // 비밀번호 암호화
        memberDTO.setEnabled(true);

        Grade grade = new Grade(); // default 회원 등급 = 1
        grade.setGradeNo(1);
        memberDTO.setGrade(grade);

        Member member = memberMapper.toEntity(memberDTO);
        System.out.println(member);
        memberRepository.save(member);

        // 회원가입 시 MEMBER 권한 부여
//        AuthorityDTO authorityDTO = new AuthorityDTO();
//        authorityDTO.setUsername(memberDTO.getUsername());
//        authorityDTO.setAuth("ROLE_MEMBER");
//        Authority authority = authorityMapper.toEntity(authorityDTO);
//        authorityRepository.save(authority);

        // 회원가입 시 cart table에 등록
        CartDTO cartDTO = new CartDTO();
        System.out.println("=================================="+memberDTO.getUsername());
//        cartDTO.setMember(member);
        cartDTO.setUsername(memberDTO.getUsername());
        Cart cart = cartMapper.toEntity(cartDTO);
        cartRepository.save(cart);

        return member.getUsername();
    }


}
