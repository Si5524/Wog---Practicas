package com.crud.crud.infrastructure.mapper;

import com.crud.crud.domain.model.User;
import com.crud.crud.infrastructure.adapter.entity.*;

public class UserMapper {

    // Convertir de UserEntity a User
    public static User toDomain(UserEntity userEntity) {
        return new User(userEntity.getId(), userEntity.getName(), userEntity.getEmail());
    }

    // Convertir de User a UserEntity
    public static UserEntity toEntity(User user) {
        return new UserEntity(user.getId(), user.getName(), user.getEmail());
    }
}
