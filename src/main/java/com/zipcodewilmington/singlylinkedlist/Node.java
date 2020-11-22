package com.zipcodewilmington.singlylinkedlist;

public class Node {

    private Node next;
    private String data;

    public Node(String dataValue){
        next = null;
        data = dataValue;
    }

    public Node(String dataValue, Node nextValue){
        next = nextValue;
        data = dataValue;
    }

    public String getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node nextValue){
        next = nextValue;
    }
}
