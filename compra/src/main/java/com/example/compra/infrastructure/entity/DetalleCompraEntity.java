package com.example.compra.infrastructure.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleCompra")
public class DetalleCompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "ordenId", nullable = false, referencedColumnName = "id")
    private OrdenCompraEntity ordenId;

    @Column(name = "monto", nullable = false)
    private double monto;

    @Column(name = "fechaPago", nullable = false)
    private LocalDateTime fechaPago;

    @Column(name = "metodoPago", nullable = false, length = 30)
    private String metodoPago;

    @Column(name = "estadoCompra", nullable = false, length = 30)
    private String estadoCompra;

    public DetalleCompraEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrdenCompraEntity getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(OrdenCompraEntity ordenId) {
        this.ordenId = ordenId;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoCompra() {
        return estadoCompra;
    }

    public void setEstadoCompra(String estadoCompra) {
        this.estadoCompra = estadoCompra;
    }

}
