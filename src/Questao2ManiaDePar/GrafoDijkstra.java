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
public class GrafoDijkstra {
    private int c;
    private int v;
    
    private Caminho[] caminhos;
    private Grafo[] grafo;
        
    public GrafoDijkstra(String entrada) {
        String[] linhas = entrada.split("\n");
        processaPrimeiraLinha(linhas[0]);
        for(int i = 0; i < linhas.length - 2; i++){
            processaLinha(linhas[i]);
        }
        
        processarGrafo();
    }
    
    public void processaPrimeiraLinha(String linha) {
        String[] dados = linha.split(" ");
        c = Integer.parseInt(dados[0]);
        v = Integer.parseInt(dados[1]);
    }
        
    public void Escreve() {
        System.out.println("Valor de c = " + c);
        System.out.println("Valor de v = " + v);
        
        System.out.println("\n");
        
        for(Caminho caminho : caminhos){
            System.out.println("Valor de c1 = " + caminho.getC1());
            System.out.println("Valor de c2 = " + caminho.getC2());
            System.out.println("Valor de g = " + caminho.getG());
            System.out.println("\n");
        }
        
        System.out.println("---------");
        System.out.println("\n");
        
        for (Grafo itemGrafo : grafo){
            System.out.println("Valor do indice = " + itemGrafo.getIndice());
            System.out.println("Valor do predecessor = " + itemGrafo.getPredecessor());
            System.out.println("Valor da distância = " + itemGrafo.getDistancia());
            System.out.println("\n");
        }
    }
    
    private void getAdjacentes(Object v){
        /*
def getAdjacentes(v):
    lstAdjacentes = set()
    for caminho in caminhos:
        if caminho['c1'] == v['indice']:
            lstAdjacentes.add(caminho['c2'])
        
        #if caminho['c2'] == v['indice']:
        #    lstAdjacentes.add(caminho['c1'])
            
    return lstAdjacentes  

        */
    }
    
    private void InicializaGrafo(){
        /*
        for cidade in range(c):
        #Cria uma estrutura - pode ser substituido por um objeto, contendo os atributos
        #indice, predecessor e distancia 
        #sys.maxsize e igual ao Integer.MAX_VALUE do Java
        #cidade + 1 significa que e para comecar de 1 e nao de 0
        g = {'indice': cidade + 1, 'predecessor': None, 
             'distancia':  sys.maxsize}
        grafo.append(g)
    
        */
    }
    
    private void ExtraiMinimo(Grafo q){
        /*
        menor = sys.maxsize
        gMenor = None
        idxRemove = 0

        idx = 0
        for q in Q:
            if q['distancia'] < menor:
                print("Indice escolhido", q['indice'])
                gMenor = q
                idx = idxRemove
                menor = q['distancia']

            idxRemove += 1

        print("idxRemove", idx)
        return [gMenor, idx]
        */
    }
    
    private int PegaCustoDasArestas(){
        return 0;
        /*
        def getCustoFromArestas(inicio, fim):
        for caminho in caminhos:
            if caminho['c1'] == inicio and caminho['c2'] == fim:
                return caminho['g']

        return 0
        */
    }
    
    private void MelhorarCusto(){
        /*
        def relaxamento(u, v, w):
        print("Vertice ", v)
        vertice = grafo[v - 1]

        if vertice['distancia'] > u['distancia'] + w:
            vertice['distancia'] = u['distancia'] + w
            vertice['predecessor'] = u['indice']
        */
    }
    
    private void Dijkstra(){
        //Seta a posição inicial para 0
        grafo[0].setDistancia(0);
        
        
        /*
        #Seta a distancia da posicao inicial pra 0
        grafo[0]['distancia'] = 0

        S = []
        Q = list(grafo)

        while len(Q) > 0:
            res = extractMin(Q)
            u = res[0]
            del Q[res[1]]

            for q in Q:
                print("Indice de q", q['indice'])

            print("Valor de u ", u['indice'])
            S.append(u)
            for adj in getAdjacentes(u):
                relaxamento(u, adj, 
                            getCustoFromArestas(u['indice'], adj))
        */
    }
    
    public int CalcularCaminho(){
        
        
        return -1;
        /*
        # MAIN
        
        #Inicializa as cidades
        inicializa()
        */
        for(int i = 0; i <= this.v; i++) {
            
        }
        /*
        #Itera o v e cria uma nova estrutura com os caminhos
        for i in range(v):
            c1, c2, g = input().split()
            c1 = int(c1)
            c2 = int(c2)
            g = int(g)
            #Cria a estrutura de caminhos - c1, c2 e g. Pode ser substituido por um objeto.
            d = {'c1': c1, 'c2': c2, 'g': g}
            caminhos.append(d)

        dijkstra()

        printa()
        */
        return 0;
    }
    
}
