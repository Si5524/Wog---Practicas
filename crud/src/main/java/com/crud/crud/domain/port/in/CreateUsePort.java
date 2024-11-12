package com.crud.crud.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.crud.crud.domain.model.User;

public interface CreateUsePort {
    
    User createUser(User user); 
    void deleteUser(Long id);
    User putUserById(User user, Long id);

    Optional<User> searchUserById(Long id);
    List<User> searchAllUsers();
}
