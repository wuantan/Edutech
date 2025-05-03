package com.example.Edutech;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pago {
    @Id
    private int id_pago;

    private int id_estudiante;
    private int monto;

    public Pago() {
    }

    public Pago(int id_pago, int monto, int id_estudiante) {
        this.id_pago = id_pago;
        this.monto = monto;
        this.id_estudiante = id_estudiante;
    }

    public int getId_pago() {
        return id_pago;
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public int getMonto() {
        return monto;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    //hacer despues: procesar @service
}
