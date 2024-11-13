package com.example.dto_simple;

public class UsuarioDto {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UsuarioDto(String nombre) {
        this.nombre = nombre;
    }
}
