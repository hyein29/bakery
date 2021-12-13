package com.bakery.mapper;

import com.bakery.dto.CartDTO;
import com.bakery.dto.ItemDTO;
import com.bakery.entity.Cart;
import com.bakery.entity.Item;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CartMapper extends EntityMapper<CartDTO, Cart> {

}
