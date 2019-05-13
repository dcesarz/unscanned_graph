package com.company;

public class Node {

    public int key;
    public Node parent;
    public int rank;


    public Node(int key, Node parent, int rank) {
        this.key = key;
        this.parent = parent;
        this.rank = rank;
    }

    public Node() {
    }





    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
