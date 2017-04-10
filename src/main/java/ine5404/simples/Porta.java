/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.simples;

/**
 *
 * @author martin
 */
public class Porta {

    public enum EstadoPorta {
        Aberta, Fechada
    }
    private EstadoPorta estado;

    public Porta() {
        this.estado = EstadoPorta.Aberta;
    }

    public void abre() {
        if (this.estado == EstadoPorta.Fechada) {
            this.estado = EstadoPorta.Aberta;
            System.out.println("Abriu!");
        } else {
            System.out.println("Já está aberta!");
        }
    }

    public void fecha() {
        if (this.estado == EstadoPorta.Aberta) {
            this.estado = EstadoPorta.Fechada;
            System.out.println("Fechou!");
        } else {
            System.out.println("Já está fechada!");
        }
    }

}
