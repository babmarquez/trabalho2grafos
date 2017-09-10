/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2ManiaDePar;

/**
 *
 * @author Barbara
 */
public class Grafo {
    private int Indice;
    private int Predecessor;
    private int Distancia;

    public Grafo(int Indice, int Predecessor, int Distancia) {
        this.Indice = Indice;
        this.Predecessor = Predecessor;
        this.Distancia = Distancia;
    }

    public int getIndice() {
        return Indice;
    }

    public void setIndice(int Indice) {
        this.Indice = Indice;
    }

    public int getPredecessor() {
        return Predecessor;
    }

    public void setPredecessor(int Predecessor) {
        this.Predecessor = Predecessor;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }
    
    
}
