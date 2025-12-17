package com.spring.store.mappers;

import com.spring.store.dtos.CartDto;
import com.spring.store.dtos.CartItemDto;
import com.spring.store.entities.Cart;
import com.spring.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);
    @Mapping(target = "totalPrice",expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
    Cart toEntity(CartDto cart);
    @Mapping(target = "id", ignore = true)
    void update(CartDto request, @MappingTarget Cart cart);
}
