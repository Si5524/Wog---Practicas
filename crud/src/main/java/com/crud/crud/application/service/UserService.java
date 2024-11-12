
package com.crud.crud.application.service;

import com.crud.crud.domain.model.User;
import com.crud.crud.domain.port.in.CreateUsePort;
import com.crud.crud.domain.port.out.UserRepositoryPort;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService implements CreateUsePort {
    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    public User createUser(User user) {
        return userRepositoryPort.saveUser(user);
    }

    public void deleteUser(Long id) {

        userRepositoryPort.deleteById(id);
    }
    public User putUserById(User user, Long id){
                
        return userRepositoryPort.updateUserById(user, id);


    }
    
    public Optional<User> searchUserById(Long id ){

        return userRepositoryPort.searchById(id); 

    }

    public List<User> searchAllUsers(){

        return userRepositoryPort.searchAll();

    }
}
