package com.example.compra.domain.model;

import java.time.LocalDateTime;

public class DetalleCompraModel {

    private Long id;
    private Long ordenId;
    private double monto;
    private LocalDateTime fechaPago;
    private String metodoPago;
    private String estadoPago;

    public DetalleCompraModel() {
    }

    public DetalleCompraModel(Long id, Long ordenId, double monto, LocalDateTime fechaPago, String metodoPago,
            String estadoPago) {

        this.id = id;
        this.ordenId = ordenId;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrdenId() {
        return ordenId;
    }

    public void setOrdenId(Long ordenId) {
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

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

}
