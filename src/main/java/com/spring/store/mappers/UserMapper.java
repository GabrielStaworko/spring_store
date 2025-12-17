package com.spring.store.mappers;

import com.spring.store.dtos.RegisterUserRequest;
import com.spring.store.dtos.UpdateUserRequest;
import com.spring.store.dtos.UserDto;
import com.spring.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
