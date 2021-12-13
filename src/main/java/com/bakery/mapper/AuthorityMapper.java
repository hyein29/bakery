package com.bakery.mapper;

import com.bakery.dto.AuthorityDTO;
import com.bakery.entity.Authority;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorityMapper extends EntityMapper<AuthorityDTO, Authority> {

}
