package com.apirestful.repository;

import com.apirestful.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // Busca el usuario por nombre de usuario
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    // Verifica si existe un usuario por nombre de usuario
    boolean existsByNombreUsuario(String nombreUsuario);
}
