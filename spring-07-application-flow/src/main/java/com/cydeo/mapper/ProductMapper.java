package com.cydeo.mapper;

import com.cydeo.dto.ProductDto;
import com.cydeo.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

@Component
public class ProductMapper {

    private final ModelMapper mapper;


    public ProductMapper(ModelMapper mapper) {
        this.mapper = mapper;
    }


    public Product convertToEntity(ProductDto dto){
        return mapper.map(dto,Product.class);

    }

    public ProductDto convertToDto(Product entity){
        return mapper.map(entity,ProductDto.class);
    }
}
