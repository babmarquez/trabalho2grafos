/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao3ArvoresGrafo;

import java.util.Vector;

/**
 *
 * @author anaFidelis
 */
public class Grafo {
    private TipoCorGrafo cor;
    private Vector<Grafo> adjacencias;

    public Grafo() {
        this.adjacencias = new Vector<Grafo>();
    }
    
    public int buscaDFS(Grafo[] g){
        int countArvore = 0;
        for (Grafo vertice: g)
            vertice.cor = TipoCorGrafo.BRANCO;
        
        for (Grafo vertice : g)
            if (vertice.cor == TipoCorGrafo.BRANCO){
                buscaDFSVisit(vertice);
                countArvore++;
            }
        
        return countArvore;
    }
    
    private void buscaDFSVisit(Grafo vertice){
        vertice.cor = TipoCorGrafo.CINZA;
        for (Grafo adj : vertice.adjacencias){
            if (adj.cor == TipoCorGrafo.BRANCO)
                buscaDFSVisit(adj);
        }
        vertice.cor = TipoCorGrafo.PRETO;
    }

    public void addAdj(Grafo adj) {
        this.adjacencias.add(adj);
    }
}
