package com.cydeo.service.impl;

import com.cydeo.dto.CartDto;
import com.cydeo.dto.CartItemDto;
import com.cydeo.dto.ProductDto;
import com.cydeo.mapper.CartMapper;
import com.cydeo.repository.CartRepository;
import com.cydeo.service.CartService;
import com.cydeo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CartServiceImpl implements CartService {

    private final ProductService productService;
    private final CartRepository cartRepository;
    private final CartMapper cartMapper;

    @Override
    public void addProduct(int productId, int quantity) {

        CartDto cart = new CartDto(0, new ArrayList<>());

        ProductDto product = productService.findById(productId);
        CartItemDto cartItem = new CartItemDto();

        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setTotalAmount(product.getPrice() * quantity);

        cart.setCartTotalAmount(cart.getCartTotalAmount() + cartItem.getTotalAmount());
        cart.getCartItemList().add(cartItem);

        cartRepository.save(cartMapper.convertToEntity(cart));

    }

    @Override
    public List<CartDto> listAllCarts() {

        return cartRepository.findAll().stream().map(cartMapper::convertToDto).collect(Collectors.toList());

//        List<CartDto> cartDtoList = new ArrayList<>();
//
//        for (Cart cart : cartRepository.findAll()) {
//
//            cartDtoList.add(cartMapper.convertToDto(cart));
//
//        }
//
//        return cartDtoList;

    }
}
