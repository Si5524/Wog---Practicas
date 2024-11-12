
package com.crud.crud.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.crud.crud.domain.model.User;

public interface UserRepositoryPort {
    User saveUser(User user);

    void deleteById(Long id);

    User updateUserById(User user, Long id);

    Optional<User> searchById(Long id);

    List<User> searchAll();

}
