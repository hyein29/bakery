package com.bakery.service;

import com.bakery.dto.MemberDTO;
import com.bakery.entity.Member;

public interface MemberService {

    public String save(MemberDTO dto);

//    default Member dtoToEntity(MemberDTO dto) {
//        Member entity = Member.builder()
//                .username(dto.getUsername())
//                .password(dto.getPassword())
//                .name(dto.getName())
//                .email(dto.getEmail())
//                .phone(dto.getPhone())
//                .build();
//        return entity;
//    }


}
