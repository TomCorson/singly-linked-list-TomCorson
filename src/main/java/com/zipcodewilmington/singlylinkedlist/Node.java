package com.zipcodewilmington.singlylinkedlist;

public class Node {

    private Node next;
    private Object data;

    public Node(Object dataValue){
        next = null;
        data = dataValue;
    }

    public Node(Object dataValue, Node nextValue){
        next = nextValue;
        data = dataValue;
    }

    public Object getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node nextValue){
        next = nextValue;
    }
}
