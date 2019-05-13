package com.company;

import java.util.ArrayList;

public class Graph {

    public ArrayList<Node> heads = new ArrayList<>();
    public int vortexes = 0;
    public int edges = 0;

    public Graph() {
    }

    public Node MakeSet(int k)
    {

        Node x = new Node();

        x.setKey(k);
        x.setParent(x);
        x.setRank(0);


        this.heads.add(x);
        //this.vortexes;
        this.edges += 1;
        return x;

    }

    public Node FindSet(Node x)
    {
        if(x!=x.getParent())
        {
        x.setParent(FindSet(x.getParent()));
        }
        return x.parent;
    }

    public void Union(Node x, Node y)
    {
        if(x.getRank()>y.getRank())
        {
            this.heads.remove(y.getParent());
            y.setParent(x);
            this.vortexes++;
        }
        else
        {
            this.heads.remove(x.getParent());
            x.setParent(y);
            if(x.getRank()==y.getRank())
            {
                y.setRank(y.getRank()+1);
            }
            this.vortexes++;
        }

    }

    public boolean isItInTheSameSet(Node x, Node y)
    {
        if(FindSet(x)==FindSet(y))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public int getVortexes() {
        return vortexes;
    }

    public void setVortexes(int vortexes) {
        this.vortexes = vortexes;
    }

    public int getEdges() {
        return edges;
    }

    public void setEdges(int edges) {
        this.edges = edges;
    }



}
