/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Carla
 */
public class  Cliente {
    private String nome;
    private String senha;
    private String restricao;
    private String sobrenome;
    private String email;

    public Cliente(String nome, String senha, String restricao, String sobrenome, String email) {
        this.nome = nome;
        this.senha = senha;
        this.restricao = restricao;
        this.sobrenome = sobrenome;
        this.email = email;
    }

 
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public String getRestricao() {
        return restricao;
    }

    public void setRestricoes(String restricao) {
        this.restricao = restricao;
    }
}
