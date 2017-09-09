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
public class Grafo {
    //falta fazer o bipartido
    public String tipoGrafo(int[][] matriz){
        String dirigido = isDirigido(matriz)? "dirigido" : "não é dirigido";
        String multiGrafo;
        String nulo = "";
        String regular = "";
        String completo = "";
        if (isMultigrafo(matriz))
            multiGrafo = ",multigrafo";
        else{
            multiGrafo = ",simples";
            if (isNulo(matriz))
                nulo = ",nulo";
            else{
                if (isCompleto(matriz)){
                    completo = ",completo";
                    regular = ",regular";                    
                }else{
                    regular = isRegular(matriz)? ",regular" : "";
                }
            }            
        }        
        
        return "O grafo é: "+dirigido+multiGrafo+nulo+regular+completo;
    }
    
    public String grausDoVertice(int[][] matriz){
        int grau;
        String sequencia = "";
        String graus = "";
        for (int i = 0; i < matriz.length; i++) {
            grau = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0)    
                    grau += matriz[i][j];
            }
            graus += "\n Véertice "+i+" - grau: "+grau; 
            sequencia += ","+grau; //tem que ordernar em ordem crescente
        }
        
        return graus+"\n"+sequencia;
    }
    
    private boolean isDirigido(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i])
                    return true;
            }
        }
        
        return false;
    }
    
    private boolean isMultigrafo(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz[i].length; j++) {
                if (((i == j) && (matriz[i][j] > 0)) || ((matriz[i][j] > 1) || ( matriz[j][i] > 1)))
                    return true;
            }
        }
        
        return false;
    }
    
    private boolean isNulo(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i; j < matriz[i].length; j++) {
                if ((matriz[i][j] > 0) || ( matriz[j][i] > 0))
                    return false;
            }
        }
        
        return true;
    }
    
    //Um grafo regular possui todos os vertices com mesmo grau
    private boolean isRegular(int[][] matriz){
        int soma;
        int somaPrim = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0){
                    if (matriz[i][j] > 0)
                        somaPrim += matriz[i][j];
                }else{
                    if (matriz[i][j] > 0)    
                        soma += matriz[i][j];
                }
            }
            if (i != 0 && somaPrim != soma)
                return false;   
        }
        
        return true;
    }
    
    //Em um grafo completo, todos os vertices se relacionam com todos os vertices
    private boolean isCompleto(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz[i].length; j++) {
                if (i != j && matriz[i][j] != 1)
                    return false;
            }
        }
        
        return true;
    }
}
