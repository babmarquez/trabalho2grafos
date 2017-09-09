/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao1DefinindoGrafo;

/**
 *
 * @author anaFidelis
 * @param <T>
 */
public abstract  class OrdenacaoAbstract<T extends Comparable<T>> {
    private T[] info;
    
    public abstract void ordenar();

    public T[] getInfo() {
        return info;
    }

    public void setInfo(T[] info) {
        this.info = info;
    }
    
    
}
