package com.crud.crud.infrastructure.adapter;

import com.crud.crud.domain.model.User;
import com.crud.crud.domain.port.out.UserRepositoryPort;
import com.crud.crud.infrastructure.adapter.entity.UserEntity;
import com.crud.crud.infrastructure.adapter.repository.*;
import com.crud.crud.infrastructure.mapper.UserMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final JpaUserRepository jpaUserRepository;

    public UserRepositoryAdapter(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User saveUser(User user) {
        UserEntity entity = new UserEntity();
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity = jpaUserRepository.save(entity);
        return new User(entity.getId(), entity.getName(), entity.getEmail());
    }

    @Override
    public void deleteById(Long id) {
        jpaUserRepository.deleteById(id);
    }

    @Override
    public User updateUserById(User user, Long id) {
        // Buscar el usuario existente o lanzar una excepción si no se encuentra
        UserEntity existingUserEntity = jpaUserRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuario no encontrado"));

        // Actualizar los campos necesarios en la entidad
        existingUserEntity.setName(user.getName());
        existingUserEntity.setEmail(user.getEmail());

        // Guardar los cambios en la base de datos y convertir el resultado a User
        UserEntity updatedUserEntity = jpaUserRepository.save(existingUserEntity);
        return UserMapper.toDomain(updatedUserEntity); // Convertir a User para el retorno
    }

    @Override
    public Optional<User> searchById(Long id) {

        return jpaUserRepository.findById(id).map(UserMapper::toDomain);
    }
   
    @Override
    public List<User> searchAll(){

        return jpaUserRepository.findAll().stream().map(UserMapper::toDomain).collect(Collectors.toList()); 
    }

}
