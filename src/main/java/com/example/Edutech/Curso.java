package com.example.Edutech;

public class Curso {
    private string id_curso, nombre, descripccion, id_instructor, categoria;

    public Curso(string id_curso, string nombre, string descripccion, string id_instructor, string categoria) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.descripccion = descripccion;
        this.id_instructor = id_instructor;
        this.categoria = categoria;
    }

    public string getId_curso() {
        return id_curso;
    }

    public string getNombre() {
        return nombre;
    }

    public string getDescripccion() {
        return descripccion;
    }

    public string getId_instructor() {
        return id_instructor;
    }

    public string getCategoria() {
        return categoria;
    }

    public void setId_curso(string id_curso) {
        this.id_curso = id_curso;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public void setDescripccion(string descripccion) {
        this.descripccion = descripccion;
    }

    public void setId_instructor(string id_instructor) {
        this.id_instructor = id_instructor;
    }

    public void setCategoria(string categoria) {
        this.categoria = categoria;
    }:

    
}
