package com.example.Edutech;

//jdbc:mariadb://localhost:3306/spring

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //esto le dice al spring que la clase es para base de datos, entonces se guardan como datos atumaticamente, algo parecido al sql. pa que no se asusten xd
public class Archivo {

    @Id //esto define la clave primaria (la id basicamente (base de datos xd))
    private int id_Archivo; //clave primaria

    private String nombre;
    private String tipo;
    private String tamaño;
    private String etiquetas;

    public Archivo() { //no borrar, importante para funcionamiento
    }

    public Archivo(int id_Archivo, String nombre, String tipo, String tamaño, String etiquetas) {
        this.id_Archivo = id_Archivo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.etiquetas = etiquetas;
    }

    public int getId_Archivo() {
        return id_Archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public void setId_Archivo(int id_Archivo) {
        this.id_Archivo = id_Archivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }
}