/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2ManiaDePar;

import java.util.*;

public class Caminho {
    private int c1;
    private int c2;
    private int g;

    public Caminho(int c1, int c2, int g) {
        this.c1 = c1;
        this.c2 = c2;
        this.g = g;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
    
}
