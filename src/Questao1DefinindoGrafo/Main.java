/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao1DefinindoGrafo;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Main
{
    public static void main(String[] args)
    {
        int[][] matriz = new int [6][6];
        
        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 0;
        matriz[0][3] = 1;
        matriz[0][4] = 1;
        matriz[0][5] = 0;
        
        matriz[1][0] = 1;
        matriz[1][1] = 0;
        matriz[1][2] = 1;
        matriz[1][3] = 0;
        matriz[1][4] = 0;
        matriz[1][5] = 1;
        
        matriz[2][0] = 0;
        matriz[2][1] = 1;
        matriz[2][2] = 0;
        matriz[2][3] = 1;
        matriz[2][4] = 1;
        matriz[2][5] = 0;
        
        matriz[3][0] = 1;
        matriz[3][1] = 0;
        matriz[3][2] = 1;
        matriz[3][3] = 0;
        matriz[3][4] = 0;
        matriz[3][5] = 1;
        
        matriz[4][0] = 1;
        matriz[4][1] = 0;
        matriz[4][2] = 1;
        matriz[4][3] = 0;
        matriz[4][4] = 0;
        matriz[4][5] = 1;
        
        matriz[5][0] = 0;
        matriz[5][1] = 1;
        matriz[5][2] = 0;
        matriz[5][3] = 1;
        matriz[5][4] = 1;
        matriz[5][5] = 0;
        
        Grafo grafo = new Grafo();
        System.out.println(grafo.tipoGrafo(matriz));
        System.out.println(grafo.arestasDoGrafo(matriz));
        System.out.println(grafo.grausDoVertice(matriz));
    }
}
