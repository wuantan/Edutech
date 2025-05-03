package com.example.Edutech;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Reporte {
    @Id
    private int id_reporte;

    private String tipo;
    private Date fecha_generacion;
    //filtros se dejan de lado por que muy complejo y completamente inecesario

    public Reporte() {
    }

    public Reporte(int id_reporte, Date fecha_generacion, String tipo) {
        this.id_reporte = id_reporte;
        this.fecha_generacion = fecha_generacion;
        this.tipo = tipo;
    }

    public int getId_reporte() {
        return id_reporte;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFecha_generacion() {
        return fecha_generacion;
    }

    public void setId_reporte(int id_reporte) {
        this.id_reporte = id_reporte;
    }

    public void setFecha_generacion(Date fecha_generacion) {
        this.fecha_generacion = fecha_generacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
