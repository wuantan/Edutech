package com.example.Edutech;

public class Curso {
    private String id_curso, nombre, descripcion, id_instructor, categoria;

    public Curso(String id_curso, String nombre, String descripcion, String id_instructor, String categoria) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_instructor = id_instructor;
        this.categoria = categoria;
    }

    public String getId_curso() {
        return id_curso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getId_instructor() {
        return id_instructor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId_curso(String id_curso) {
        this.id_curso = id_curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setId_instructor(String id_instructor) {
        this.id_instructor = id_instructor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}