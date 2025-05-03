package com.example.Edutech;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notificacion {
    @Id
    private int id_Notificacion;

    private String mensaje;
    private String destino;
    private String tipo;

    public Notificacion() {
    }

    public Notificacion(int id_Notificacion, String tipo, String destino, String mensaje) {
        this.id_Notificacion = id_Notificacion;
        this.tipo = tipo;
        this.destino = destino;
        this.mensaje = mensaje;
    }

    public int getId_Notificacion() {
        return id_Notificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getDestino() {
        return destino;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId_Notificacion(int id_Notificacion) {
        this.id_Notificacion = id_Notificacion;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    //ahora con un service se podria hacer la notificacion.
    //HACER DESPUES!
}
