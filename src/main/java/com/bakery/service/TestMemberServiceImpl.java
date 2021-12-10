package com.bakery.service;

import com.bakery.dto.TestMemberDTO;
import com.bakery.entity.TestMember;
import com.bakery.repository.TestMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestMemberServiceImpl implements TestMemberService {

    @Autowired
    TestMemberRepository testMemberRepository;

    @Transactional
    @Override
    public Long register(TestMemberDTO dto) {
        TestMember entity = dtoToEntity(dto);
        testMemberRepository.save(entity);
        return entity.getId(); // id가 존재할 경우 merge() 호출
    }

}
