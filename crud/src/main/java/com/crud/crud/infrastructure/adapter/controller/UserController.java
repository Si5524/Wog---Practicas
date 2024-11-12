
package com.crud.crud.infrastructure.adapter.controller;

import com.crud.crud.application.service.UserService;
import com.crud.crud.domain.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Crear usuario
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // Eliminar usuario por id
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    // Actualizar usuario por id
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, @RequestBody User user) {

        User userUpdate = userService.putUserById(user, id);
        return ResponseEntity.ok(userUpdate);
    }

    // Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {

        Optional<User> userFind = userService.searchUserById(id);
        return userFind.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // Buscar Todos
    @GetMapping
    public ResponseEntity<List<User>> findAll() {

        List<User> userAll = userService.searchAllUsers();
        return ResponseEntity.ok(userAll);
    }

}
