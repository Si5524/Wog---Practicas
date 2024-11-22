package com.veterianria.veterinaria.infrastructure.Jpa.reporitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterianria.veterinaria.infrastructure.DuenoEntity;

@Repository

public interface DuenoRepository extends JpaRepository<DuenoEntity, Long> {

}
