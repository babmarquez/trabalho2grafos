/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2ManiaDePar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Ana Paula Fidelis e Bárbara Marquez
 */
public class Questao2 {
    private static final int NULL = 0x3f3f3f3f;

    private static int maniaDeParDijkstra(Map<Integer, List<Pair>> lists, int targetCity)
    {
        Pair[] dist = new Pair[lists.size()];
        dist[0] = new Pair(0, NULL);
        if (targetCity > 1) for (int i = 1; i < targetCity; ++i) dist[i] = new Pair(NULL, NULL);

        PriorityQueue<Pair> queue = new PriorityQueue<>();
        queue.add(new Pair(0, 0));

        while (!queue.isEmpty()) {
            Pair item = queue.poll();

            int d = item.getFirst();
            int v = item.getSecond();

            if(d > dist[v].getFirst() && d > dist[v].getSecond()) continue;

            for (int i = 0; i < lists.get(v).size(); ++i) {
                Pair u = lists.get(v).get(i);

                if (dist[v].getFirst() +u.getSecond() < dist[u.getFirst()].getSecond()) {
                    dist[u.getFirst()].setSecond(dist[v].getFirst() + u.getSecond());
                    queue.add(new Pair(dist[u.getFirst()].getSecond(), u.getFirst()));
                }
                if (dist[v].getSecond() + u.getSecond() < dist[u.getFirst()].getFirst()) {
                    dist[u.getFirst()].setFirst(dist[v].getSecond() + u.getSecond());
                    queue.add(new Pair(dist[u.getFirst()].getFirst(), u.getFirst()));
                }
            }
        }

        int cost = dist[targetCity - 1].getFirst();
        return cost == NULL ? -1 : cost;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mania de par");
        System.out.println("Digite a entrada:");
        
        String read = sc.nextLine();
        String[] parts = read.split("\\s");

        int c = Integer.parseInt(parts[0]);
        int v = Integer.parseInt(parts[1]);

        Map<Integer, List<Pair>> map = new HashMap<>();
        
        for (int i = 0; i < c; ++i) {
            map.put(i, new LinkedList<>());
        }

        for (int i = 0; i < v; ++i) {
            read = sc.nextLine();
            parts = read.split("\\s");

            int c1 = Integer.parseInt(parts[0]) - 1;
            int c2 = Integer.parseInt(parts[1]) - 1;
            int g = Integer.parseInt(parts[2]);

            map.get(c1).add(new Pair(c2, g));
            map.get(c2).add(new Pair(c1, g));
        }

        sc.close();
        System.out.println(maniaDeParDijkstra(map, c));
    }
}
