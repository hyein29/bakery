package com.bakery.service;

import com.bakery.dto.MemberDTO;
import com.bakery.dto.TestMemberDTO;
import com.bakery.entity.Member;
import com.bakery.entity.TestMember;

public interface MemberService {

    public String save(MemberDTO dto);

    default Member dtoToEntity(MemberDTO dto) {
        Member entity = Member.builder()
                .username(dto.getUsername())
                .password(dto.getPassword())
                .name(dto.getName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .unregDate(dto.getUnregDate())
                .enabled(dto.isEnabled())
                .grade(dto.getGrade())
                .build();
        return entity;
    }


}
