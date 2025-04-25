package com.apirestful.repository;

import com.apirestful.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

    // Busca una categoría por su nombre
    Categoria findByNombre(String nombre);

    // Verifica si existe una categoría con un nombre específico
    boolean existsByNombre(String nombre);
}
