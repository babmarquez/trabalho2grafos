/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2ManiaDePar;

import java.util.ArrayList;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class GrafoDijkstra {
    private int c;
    private int v;
    
    int matriz[][];
    int verticeInicial;
    int vertices[];
    Integer pai[];
    int custo[];
    
    public GrafoDijkstra(String entrada) {
        String[] linhas = entrada.split("\n");
        processaPrimeiraLinha(linhas[0]);
        for(int i = 0; i < linhas.length - 2; i++){
            processaLinha(linhas[i]);
        }
        
        this.matriz = matriz;
        this.vertices = vertices;
        this.pai = new Integer[matriz.length];
        custo = new int[matriz.length];
    }
    
    public void processaPrimeiraLinha(String linha) {
        String[] dados = linha.split(" ");
        c = Integer.parseInt(dados[0]);
        v = Integer.parseInt(dados[1]);
    }
    
    private void processaLinha(String linha){
        String[] dados = linha.split(" ");
        int c1 = Integer.parseInt(dados[0]);
        int c2 = Integer.parseInt(dados[2]);
        int g = Integer.parseInt(dados[1]);
        
        //matriz[][]
    }
            
    public void inicializaGrafo() 
    {
        vertices[0] = verticeInicial;
        pai[0] = null;
        custo[0] = 0;
        
        for (int i = 1; i < vertices.length; i++) 
        {
            pai[i] = null;
            custo[i] = Integer.MAX_VALUE;
        }
    }
    
    public void funcaoRelaxamento(int pivo, int vertice)
    {
        if (getDistanciaVertice(pivo, vertice) < Integer.MAX_VALUE && 
                getCustoVertice(vertice) >  getCustoVertice(pivo) + getDistanciaVertice(pivo, vertice)) 
        {
            this.custo[vertice] = this.custo[pivo] + getDistanciaVertice(pivo, vertice);
            this.pai[vertice] = pivo;
        }
    }
    
    public int getCustoVertice(int vertice)
    {
        for (int i = 0; i < vertices.length; i++) {
            if (vertice == vertices[i]) {
                return custo[i];
            }
        }
        return 0;
    }
    
    public int getDistanciaVertice(int verticeInicial, int verticeFinal)
    {
        return this.matriz[verticeInicial][verticeFinal];
    }
    
    public void calculaDijsktra()
    {
        inicializaGrafo();
        int[] s = new int[vertices.length];
        int q[] = new int[vertices.length];
        for (int k = 0; k < vertices.length; k++) {
            q[k] = vertices[k];
        }
        int i = 0;
        int u = Integer.MAX_VALUE;
        while (i < q.length) 
        {
            u = extractMinimo(q);
            s[i] = u;
            
            for (int j = 0; j < vertices.length; j++) {
                if (!isPercorrido(s, vertices[j])) {
                    funcaoRelaxamento(u, vertices[j]);
                }
            }
            q[i] = Integer.MAX_VALUE;
            i++;
        }
    }
    
    public boolean isPercorrido(int s[], int v)
    {
        for (int i : s) {
            if (i == v) return true;
        }
        return false;
    }
    
    /* Extrai o mínimo do array de vértices - com o menor custo */
    public int extractMinimo(int vertices[]) 
    {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] != Integer.MAX_VALUE && custo[vertices[i]] < minimo) {
                minimo = vertices[i];
            }
        }
        return minimo;
    }
}
