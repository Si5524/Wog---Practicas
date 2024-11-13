package com.example.dto_simple;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/{id}")
    public UsuarioDto obtenerUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return UsuarioMapper.usuarioToDto(usuario);
    }

    @GetMapping
    /* Sin Dto
     
     * public List<Usuario> obtenerTodosUsuarios() {
     * return usuarioRepository.findAll();
     * }
     */


    //Con Dto

    public List<UsuarioDto> obtenerUsuarios(){

        List<Usuario> usuarios = usuarioRepository.findAll();

        List<UsuarioDto> usuarioDtos = usuarios.stream().map(UsuarioMapper :: usuarioToDto).collect(Collectors.toList());
        return usuarioDtos;
    }

    @PostMapping
    public UsuarioDto createUsuario(@RequestBody UsuarioDto usuarioDTO) {
        // Convertimos el DTO a la entidad Usuario
        Usuario usuario = UsuarioMapper.usuarioDtoToUsuario(usuarioDTO);

        // Guardamos la entidad en la base de datos
        Usuario usuarioGuardado = usuarioRepository.save(usuario);

        // Retornamos el DTO con los datos del usuario guardado
        return UsuarioMapper.usuarioToDto(usuarioGuardado);
    }
}
