package com.example.compra.infrastructure.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.compra.infrastructure.entity.OrdenCompraEntity;

public interface JpaOrdenCompraRepository extends JpaRepository<OrdenCompraEntity,Long>{

}
