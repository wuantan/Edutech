package com.example.Edutech;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificado {
    @Id
    private int id_certificado;

    private int id_estudiante; //tal vez haya que crear clase estudiante
    private int id_curso;

    public Certificado() {
    }

    public Certificado(int id_certificado, int id_estudiante, int id_curso) {
        this.id_certificado = id_certificado;
        this.id_estudiante = id_estudiante;
        this.id_curso = id_curso;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public int getId_curso() {
        return id_curso;
    }

    public int getId_certificado() {
        return id_certificado;
    }

    public void setId_certificado(int id_certificado) {
        this.id_certificado = id_certificado;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    //emitir va a ser un servicio supongo a si que lo veo despues
}
