package com.apirestful.controller;

import com.apirestful.exception.RecursoNoEncontradoException;
import com.apirestful.model.Usuario;
import com.apirestful.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Mostrar todos los usuarios
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    // Obtener usuario por ID
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Usuario no encontrado con ID: " + id));
    }

    // Crear nuevo usuario
    @PostMapping
    public Usuario createUsuario(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Actualizar usuario por ID
    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable Integer id, @Valid @RequestBody Usuario usuarioDetails) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setNombreCompleto(usuarioDetails.getNombreCompleto());
            usuario.setNombreUsuario(usuarioDetails.getNombreUsuario());
            usuario.setClave(usuarioDetails.getClave());
            usuario.setNivelAcceso(usuarioDetails.getNivelAcceso());
            usuario.setEstado(usuarioDetails.isEstado());
            return usuarioRepository.save(usuario);
        }).orElseThrow(() -> new RecursoNoEncontradoException("Usuario no encontrado con ID: " + id));
    }

}
