/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao3ArvoresGrafo;

/**
 *
 * @author anaFidelis
 */
public class Main {
    public static void main(String[] args) {
        Grafo gA = new Grafo();
        Grafo gB = new Grafo();
        Grafo gC = new Grafo();
        Grafo gD = new Grafo();
        Grafo gE = new Grafo();
        Grafo gF = new Grafo();
        Grafo gG = new Grafo();
        Grafo gH = new Grafo();
        Grafo gI = new Grafo();
        Grafo gJ = new Grafo();
        Grafo gK = new Grafo();
        
        gA.addAdj(gB);
        gA.addAdj(gF);
        
        gB.addAdj(gA);
        gB.addAdj(gF);
        
        gF.addAdj(gA);
        gF.addAdj(gB);
        gF.addAdj(gE);
        
        gE.addAdj(gF);
        gE.addAdj(gI);
        gE.addAdj(gD);
        
        gI.addAdj(gJ);
        gI.addAdj(gE);
        gI.addAdj(gD);
        gI.addAdj(gC);
        
        gD.addAdj(gE);
        gD.addAdj(gC);
        gD.addAdj(gI);
        
        gC.addAdj(gI);
        gC.addAdj(gD);
        
        gJ.addAdj(gI);
        gJ.addAdj(gE);
        
        gG.addAdj(gH);
        
        gH.addAdj(gG);
        
        Grafo[] grafos = new Grafo[11];
        grafos[0] = gA;
        grafos[1] = gB;
        grafos[2] = gC;
        grafos[3] = gD;
        grafos[4] = gE;
        grafos[5] = gF;
        grafos[6] = gG;
        grafos[7] = gH;
        grafos[8] = gI;
        grafos[9] = gJ;
        grafos[10] = gK;
        
        System.out.println("Total de arvores: "+gH.buscaDFS(grafos));
    }
}
