/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Produto {

    String nomeProd;
    String precoProd;
    String codigoProd;
    String descricaoProd;

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(String precoProd) {
        this.precoProd = precoProd;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getDescricaoProd() {
        return descricaoProd;
    }

    public void setDescricaoProd(String descricaoProd) {
        this.descricaoProd = descricaoProd;
    }

    public Produto(String nomeProd, String precoProd, String codigoProd, String descricaoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.codigoProd = codigoProd;
        this.descricaoProd = descricaoProd;
    }
}
