/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

/**
 *
 * @author fernando.fernandes
 */
public class Carro {

    private String cor;
    private String fabricante;
    private String[] rodas;
    private String modelo;
    private String velocidadeAtual;

    public String getCor() {
        return cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeAtual(String velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Carro() {
    }
    public String descreve(){
        if(this.cor== null){
            return "Um "+this.modelo;       
        }
        if(this.modelo==null){
            return "Um carro";
        }
        
        return "Um "+this.modelo+" na cor "+this.cor ;
    }

}
