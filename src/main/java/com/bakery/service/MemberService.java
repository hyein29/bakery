package com.bakery.service;

import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import com.bakery.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Member save(Member member) {
        // 비밀번호 암호화
        String encodedPassword = passwordEncoder.encode(member.getPassword());
        member.setPassword(encodedPassword);

        member.setEnabled(true);

        // default 회원 등급 = 1
        Grade grade = new Grade();
        grade.setGradeNo(1);
        member.setGrade(grade);

        return memberRepository.save(member);
    }

}
