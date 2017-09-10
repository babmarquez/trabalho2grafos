/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2ManiaDePar;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Pair implements Comparable<Pair>
{
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public int compareTo(Pair p) {
        return (this.first < p.first || (!(p.first < this.first)&& this.second < p.second)) ? 1 : -1;
    }
}