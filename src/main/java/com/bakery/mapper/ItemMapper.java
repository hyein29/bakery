package com.bakery.mapper;

import com.bakery.dto.ItemDTO;
import com.bakery.dto.MemberDTO;
import com.bakery.entity.Item;
import com.bakery.entity.Member;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ItemMapper extends EntityMapper<ItemDTO, Item> {

}
