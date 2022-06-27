package com.template.api.utils.interfaces;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

    public interface BaseDtoMapper<E, R, C, U> {

        R toResponse(E entity);

        E create(C dto);

    void update(U dto, @MappingTarget E entity);
}
