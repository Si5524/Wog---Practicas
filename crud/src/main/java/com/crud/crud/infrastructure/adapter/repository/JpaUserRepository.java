
package com.crud.crud.infrastructure.adapter.repository;

import com.crud.crud.infrastructure.adapter.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
