package com.company;

/*

Program tworzy graf nieskierowany, w ktorym znajduja sie skladowe spojnosci przedstawione w postaci zbiorow rozlacznych.
Wersja z ranga, bez kompresji by moc prawidlowo dodawac krawedzie, postac drzewiasta.
Liczy ilosc krawedzi i wierzcholkow w grafie.

*/

public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();
        Node[] nodes;
        nodes = new Node[9];

        for(int i = 0; i<nodes.length;i++)
        {
            nodes[i] = g.MakeSet(i);
        }


        g.Union(g.FindSet(nodes[0]),g.FindSet(nodes[1]));
        g.Union(g.FindSet(nodes[0]),g.FindSet(nodes[2]));
        g.Union(g.FindSet(nodes[0]),g.FindSet(nodes[3]));

        g.Union(g.FindSet(nodes[4]),g.FindSet(nodes[5]));
        g.Union(g.FindSet(nodes[5]),g.FindSet(nodes[8]));

        g.Union(g.FindSet(nodes[8]),g.FindSet(nodes[1]));

        System.out.println("RANGA NODE 1: " + g.FindSet(nodes[0]).getRank());
        System.out.println("KRAWEDZIE: " + g.vortexes);
        System.out.println("WIERZCHOLKI: " + g.edges);
        System.out.println(g.isItInTheSameSet(g.FindSet(nodes[0]),g.FindSet(nodes[8])));
        System.out.println(g.isItInTheSameSet(g.FindSet(nodes[0]),g.FindSet(nodes[6])));
    }
}
