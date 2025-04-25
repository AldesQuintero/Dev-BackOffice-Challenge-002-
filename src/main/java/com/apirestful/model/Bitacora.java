package com.apirestful.model;

import javax.persistence.*;
import java.time.LocalDateTime;



@Entity
@Table(name = "Bitacora")

public class Bitacora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 

    @ManyToOne 
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario; 

    @Column(name = "accion ", nullable = false)
    private String accion; 

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro = LocalDateTime.now();

    public Bitacora(){}

    public Bitacora(Usuario usuario, String accion) {
        this.usuario = usuario; 
        this.accion = accion; 
        this.fechaRegistro = LocalDateTime.now();
    }
    // Getters & Setters 
    public Integer getId(){
        return id; 
    }

    public void setId(Integer id){
        this.id = id; 
    }

    public Usuario getUsuario(){
        return usuario; 
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario; 
    }

    public String getAccion(){
        return accion; 
    }

    public void setAccion(String accion){
        this.accion = accion; 
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }


}







