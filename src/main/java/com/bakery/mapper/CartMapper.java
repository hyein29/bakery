package com.bakery.mapper;

import com.bakery.dto.CartDTO;
import com.bakery.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CartMapper extends EntityMapper<CartDTO, Cart> {

    @Override
    @Mapping(source = "member.username", target = "username")
    CartDTO toDto(Cart entity);

    @Override
    @Mapping(source = "username", target = "member.username")
    Cart toEntity(CartDTO dto);
}