package com.apirestful.repository;

import com.apirestful.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    // Buscar una categoría por su nombre
    Categoria findByNombre(String nombre);

    // Verificar si existe una categoría con un nombre específico
    boolean existsByNombre(String nombre);
}
