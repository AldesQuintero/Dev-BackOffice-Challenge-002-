package com.apirestful.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Clase que representa la entidad Producto en la base de datos.
 * Mapea la tabla Productos y sus columnas
**/

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria; // Relacioón muchos a uno con la entidad Categoria.
                                // Indica a qué categorría pertenece el producto.
                                // Un producto debe tener una categoría.

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "precio", nullable = false)
    private double precio;

    @ElementCollection
    @CollectionTable(name = "Producto_Tags", joinColumns = @JoinColumn(name = "producto_id"))  // Corregido: joinColumns
    @Column(name = "tag", nullable = false)
    private List<String> tags;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @Column(name = "estado", nullable = false)
    private boolean estado; // Estado del producto (activo/inactivo). No puede ser nulo.

    public Producto() {

    }


    /** Contrusctores con parametros para crear un objeto Producto
     * El nombre del producto.
     * La categoría del producto.
     * El Costo del producto.
     * El precio del producto.
     * La lista de etiqueta del producto.
     * El estado del producto.
     */

    public Producto(String nombre, Categoria categoria, double costo, double precio, List<String> tags, boolean estado) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.costo = costo;
        this.precio = precio;
        this.tags = tags;
        this.estado = estado;
    }



    // Getters & Setters of Id
    public Integer getId() {  
        return id;
}

    public void setId(Integer id) { 
        this.id = id;
    }

    // Getters & Setters of Nombre 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters & Setters of Categoria
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    // Getters & Setters of Costo
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    // Getters & Setters of Precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getters & Setters of List Tags
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    // Getters & Setters of Fecha
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    // Getters & Setters of Estado
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado; 
    }
}