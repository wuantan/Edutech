package com.example;

import java.util.Date;

//por que usuario esta fuerda de la carpeta edutech?

public class Usuario {

    public String id_user,nom_User,correo_user,rol;
    public Date Fec_last_login;
    public boolean estado;

    public Usuario() {
    }

    public Usuario(String id_user, String nom_User, String correo_user, String rol, Date fec_last_login,
            boolean estado) {
        this.id_user = id_user;
        this.nom_User = nom_User;
        this.correo_user = correo_user;
        this.rol = rol;
        Fec_last_login = fec_last_login;
        this.estado = estado;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNom_User() {
        return nom_User;
    }

    public void setNom_User(String nom_User) {
        this.nom_User = nom_User;
    }

    public String getCorreo_user() {
        return correo_user;
    }

    public void setCorreo_user(String correo_user) {
        this.correo_user = correo_user;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFec_last_login() {
        return Fec_last_login;
    }

    public void setFec_last_login(Date fec_last_login) {
        Fec_last_login = fec_last_login;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Personalizados

    // Desactivar_cuenta

    //Notificar
    

}
