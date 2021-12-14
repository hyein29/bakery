package com.bakery.mapper;

import com.bakery.dto.MemberDTO;
import com.bakery.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper extends EntityMapper<MemberDTO, Member> {

//    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);
//
//    Member toEntity(MemberDTO memberDTO);
//
//    MemberDTO toDTO(Member member);
}
