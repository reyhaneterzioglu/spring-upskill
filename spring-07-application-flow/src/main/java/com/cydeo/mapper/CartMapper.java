package com.cydeo.mapper;

import com.cydeo.dto.CartDto;
import com.cydeo.entity.Cart;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CartMapper {

    private final ModelMapper mapper;


    public CartMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }


    public Cart convertToEntity(CartDto dto){
        return mapper.map(dto,Cart.class);

    }

    public CartDto convertToDto(Cart entity){
        return mapper.map(entity,CartDto.class);
    }


}
