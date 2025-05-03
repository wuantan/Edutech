package com.example.Edutech;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curso {
    @Id
    private int id_curso;

    private String nombre;
    private String descripcion;
    private int id_instructor;
    private String categoria;

    public Curso() {
    }

    public Curso(int id_curso, int id_instructor, String categoria, String descripcion, String nombre) {
        this.id_curso = id_curso;
        this.id_instructor = id_instructor;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getId_curso() {
        return id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getId_instructor() {
        return id_instructor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setId_instructor(int id_instructor) {
        this.id_instructor = id_instructor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}