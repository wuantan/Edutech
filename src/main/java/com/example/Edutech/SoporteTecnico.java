package com.example.Edutech;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SoporteTecnico {
    @Id
    private int id_soporteTecnico;

    private String descripcion;
    private int prioridad; //Hagamos la prioridad con un sistema de numeros, maximo 5. si ven esto diganme que les parece
    private String estado; //esto no se como hacerlo por que habria que modificar el estado del soporte, supongo que habra que ver

    public SoporteTecnico() {
    }

    public SoporteTecnico(int id_soporteTecnico, String estado, int prioridad, String descripcion) {
        this.id_soporteTecnico = id_soporteTecnico;
        this.estado = estado;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
    }

    public int getId_soporteTecnico() {
        return id_soporteTecnico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setId_soporteTecnico(int id_soporteTecnico) {
        this.id_soporteTecnico = id_soporteTecnico;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
