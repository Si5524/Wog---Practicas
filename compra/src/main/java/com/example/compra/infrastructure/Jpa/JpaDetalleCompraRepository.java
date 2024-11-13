package com.example.compra.infrastructure.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.compra.infrastructure.entity.DetalleCompraEntity;

public interface JpaDetalleCompraRepository extends JpaRepository<DetalleCompraEntity, Long> {
    

}
