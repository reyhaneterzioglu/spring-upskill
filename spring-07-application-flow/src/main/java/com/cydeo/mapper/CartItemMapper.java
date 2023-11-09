package com.cydeo.mapper;

import com.cydeo.dto.CartItemDto;
import com.cydeo.entity.CartItem;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CartItemMapper {

    private final ModelMapper mapper;


    public CartItemMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }


    public CartItem convertToEntity(CartItemDto dto){
        return mapper.map(dto,CartItem.class);

    }

    public CartItemDto convertToDto(CartItem entity){
        return mapper.map(entity,CartItemDto.class);
    }
}
