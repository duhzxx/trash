package com.trash.transformers.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;
    private String email;
    private String senha;
    private String tipo_usuario;


    public Usuario() {

    }

    public Usuario(Integer id_usuario, String email, String senha, String tipo_usuario) {
        this.id_usuario = id_usuario;
        this.email = email;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getConfirmSenha() {
        return "";
    }
}
