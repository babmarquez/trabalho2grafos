/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao1DefinindoGrafo;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 * @param <T>
 */
public class OrdenacaoMergeSort<T extends Comparable<T>> extends OrdenacaoAbstract<T>
{
    @Override
    public void ordenar() {        
        int tamanho = getInfo().length;
        ordenar(0, tamanho-1);
    }
    
    private void ordenar(int inicio, int fim){
        if  (inicio < fim){
            int meio = (inicio + fim)/2;
            ordenar(inicio, meio);
            ordenar(meio+1, fim);
            merge(inicio, meio, fim);
        }
    }
    
    private void merge(int inicio, int meio, int fim){
        T[] vet = getInfo();
        
        int tamEsquerda = meio - inicio+1;
        T[] esquerda = (T[]) new Comparable[tamEsquerda];
        for (int i = 0; i < tamEsquerda; i++) {
            esquerda[i] = vet[inicio+i];            
        }        
        
        int tamDireita = fim - meio;
        T[] direita = (T[]) new Comparable[tamDireita];
        for (int i = 0; i < tamDireita; i++) {
            if (meio+1+i < vet.length)
                direita[i] = vet[meio+1+i];
            else
                direita[i] = vet[meio+i];
        }
        
        int esq = 0, dir = 0, i = 0;
        for (i = inicio; i <= fim; i++) {
            if ((esq < tamEsquerda) && (dir < tamDireita)){
                if (esquerda[esq].compareTo(direita[dir]) == -1 ){
                    vet[i] = esquerda[esq];
                    esq++;
                }else{
                    vet[i] = direita[dir];
                    dir++;
                }
            }else break;                
        }
        
        while (esq < tamEsquerda){
            vet[i] = esquerda[esq];
            esq++;
            i++;
        }
        
        while (dir < tamDireita){
            vet[i] = direita[dir];
            dir++;
            i++;
        }
        
        setInfo(vet);
    }
    
    public String mostraVetor(T[] vetor, String separador){
        String result = "";
        for (T val : vetor) {
            result += val+separador;            
        }    

        return result.substring(0, result.length() - 1);
    }
}
