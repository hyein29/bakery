package com.bakery.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface EntityMapper<D, E> {

    D toDto(E entity);
    E toEntity(D dto);

//    List<D> toDtoList(List<E> entityList);
//    List<E> toEntityList(List<D> dtoList);

//    @Named("partialUpdate")
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void partialUpdate(@MappingTarget E entity, D dto);

}
