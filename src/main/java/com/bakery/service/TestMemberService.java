package com.bakery.service;

import com.bakery.dto.TestMemberDTO;
import com.bakery.entity.TestMember;

public interface TestMemberService {

    Long register(TestMemberDTO dto);

    default TestMember dtoToEntity(TestMemberDTO dto) {
        TestMember entity = TestMember.builder()
                .id(dto.getId())
                .userId(dto.getUserId())
                .userPw(dto.getUserPw())
                .build();
        return entity;
    }
}
