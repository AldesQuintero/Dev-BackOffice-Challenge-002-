package com.apirestful.repository;

import com.apirestful.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Buscar usuario por nombre de usuario
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    // Verificar si existe un usuario por nombre de usuario
    boolean existsByNombreUsuario(String nombreUsuario);
}
