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
public class Grafo {
    private int numeroCidades;
    private int numeroEstradas;
    private int soma;
    
    private int[][] matriz;
    
    /*
    Entrada: consiste em diversas linhas, a primeira contém 2 inteiros C e V, o número total de cidades e
    o número de estradas(2<= C <= 10^4 e 0 <= V <= 50000). As cidades são identificadas por inteiros de 1 a C.
    Cada estrada liga duas cidades distintas, e há no máximo uma estrda entre cada par de cidades. Cada uma das
    V linhas seguintes contêm três inteiros C1, C2 e G. indicando que o valor do pedágio da estrada que liga as
    cidades c1 e c2 é G (1 <= C1, C2 <= C e 1 <= G <= 10^4). Patrícia está atualmente na cidade 1 e a cidade do
    cliente é C.

    Saída: valor dos pedágios. Se não for par, retorna -1
    */
    
    public Grafo(String entrada) {
        String[] linhas = entrada.split("\n");
        processaPrimeiraLinha(linhas[0]);
        /*
        if (verificaPar(numeroCidades)){
            System.err.println("-1");
        }
        */
        for(int i = 0; i < linhas.length - 2; i++){
            processaLinha(linhas[i]);
        }
        
        processarGrafo();
    }
    
    public void processaPrimeiraLinha(String linha) {
        String[] dados = linha.split(" ");
        numeroCidades = Integer.parseInt(dados[0]);
        numeroEstradas = Integer.parseInt(dados[1]);
        matriz = new int[numeroCidades][numeroCidades];
    }
    
    public void processaLinha(String linha){
        String[] dados = linha.split(" ");
        int ind1 = Integer.parseInt(dados[0]);
        int ind2 = Integer.parseInt(dados[2]);
        
        matriz[ind1][ind2] = Integer.parseInt(dados[1]);
    }
    
    public void processarGrafo(){
        
    }
    
    /* Exemplo internet
    // assume que os nós são numerados 0, 1, ... n e que o Nó de origem é 0
   ArrayList <Node> findShortestPath (nós Node [], bordas Edge [], Node target) {
       int [] [] Weight = initializeWeight (nós, bordas);
       int [] D = new int [nodes.length];
       Nó [] P = novo nó [nodes.length];
       ArrayList <Node> C = novo ArrayList <Node> ();

       // inicializar:
       // (C) andidate set,
       // (D) yjkstra comprimento do caminho especial, e
       // (P) nó anterior no caminho mais curto
       para (int i = 0; i <nodes.length; i ++) {
           C.add (nós [i]);
           D [i] = Peso [0] [i];
           se (D [i]! = Integer.MAX_VALUE) {
               P [i] = nós [0];
           }
       }

       // rasteja o gráfico
       para (int i = 0; i <nodes.length-1; i ++) {
           // encontre o Edge mais leve entre os candidatos
           int l = Integer.MAX_VALUE;
           Nó n = nós [0];
           para (Nó j: C) {
               se (D [j.name] <l) {
                   n = j;
                   l = D [j.name];
               }
           }
           C.remove (n);

           // veja se quaisquer Bordas deste Nó produzem um caminho mais curto do que o Origem-> esse Nó
           para (int j = 0; j <nodes.length-1; j ++) {
               se (D [n.name]! = Integer.MAX_VALUE && Weight [n.name] [j]! = Integer.MAX_VALUE && D [n.name] + Peso [n.name] [j] <D [j] ) {
                   // encontrou um, atualize o caminho
                   D [j] = D [n.name] + Peso [n.name] [j];
                   P [j] = n;
               }
           }
       }
       // temos o nosso caminho. reutilize C como a lista de resultados
       C.clear ();
       int loc = target.name;
       C.add (target);
       // retrocede do alvo por P (exuberante), adicionando à lista de resultados
       enquanto (P [loc]! = nodes [0]) {
           se (P [loc] == null) {
               // parece que não há caminho da origem para o alvo
               retorno nulo;
           }
           C.add (0, P [loc]);
           loc = P [loc] .name;
       }
       C.add (0, nodes [0]);
       retornar C;
   }

   private int [] [] initializeWeight (nó [] nós, Borda [] bordas) {
       int [] [] Peso = novo int [nodes.length] [nodes.length];
       para (int i = 0; i <nodes.length; i ++) {
           Arrays.fill (Peso [i], Integer.MAX_VALUE);
       }
       para (Edge e: bordas) {
           Peso [e.from.name] [e.to.name] = e.weight;
       }
       retornar peso;
   }
    */
}
