package com.example.compra.domain.model;

import java.time.LocalDateTime;

public class OrdenCompraModel {

    private Long id;
    private LocalDateTime fechaCreacion;
    private String estado;
    private double total;

    public OrdenCompraModel(Long id, LocalDateTime fechaCreacion, String estado, double total) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.total = total;

        if(this.estado == "Cancelada"){

            throw new IllegalStateException("No se puede cambiar el estado de la compra porque esta cancelada");
            
        }
        this.estado = estado;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
