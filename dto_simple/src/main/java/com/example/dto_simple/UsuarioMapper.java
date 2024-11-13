package com.example.dto_simple;

public class UsuarioMapper {

    
    public static UsuarioDto usuarioToDto(Usuario usuario){

        return new UsuarioDto(usuario.getNombre());
    }

    public static Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto){
       
        Usuario usuario = new Usuario();
        
        usuario.setNombre(usuarioDto.getNombre());
        
        return usuario; 

    }

}
