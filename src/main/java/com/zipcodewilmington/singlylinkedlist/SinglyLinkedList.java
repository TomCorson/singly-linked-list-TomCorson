package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private static int counter;
    private Node head;

    public SinglyLinkedList() {
    }

    public void add(Object data) {
        if (head == null) {
            head = new Node(data);
        }
        Node temporary = new Node(data);
        Node current = head;
        if (current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temporary);
        }
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public Object get(int index) {
        if (index < 0)
            return null;
        Node current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();

            }
            return current.getData();
        }

        return current.getData();
    }

    public boolean remove(int index){
        if(index < 1 || index > size()){
            return false;
        }
        Node current = head;
        if(head != null){
            for(int i = 0; i < index; i++){
                if(current.getNext() == null)
                    return false;
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            counter--;
            return true;
        }
        return false;
    }

    public int size(){
        return getCounter();
    }

    public String toString(){
        String output = "";
        if(head != null){
            Node current = head.getNext();
            while(current != null){
                output += current.getData().toString();
                current = current.getNext();
            }
        }
        return output;
    }

    public boolean contains(Object o){
        boolean containsObj = false;
        if(head != null){
            Node current = head.getNext();
            while(current != null){
                if(current.getData().equals(o)){
                    containsObj = true;
                }
                current = current.getNext();
            }
        }
        return  containsObj;
    }
    public boolean containsAll(SinglyLinkedList list){
        boolean containsObjs = true;
        int i = -1;
        if(head != null){
            Node current = head.getNext();
            while(current != null){
                i++;
                if(!current.getData().equals(list.get(i))){
                    containsObjs = false;
                }
                current = current.getNext();
            }
        }
        return  containsObjs;
    }

    public Integer find(Object o) {
        Integer index = -1;
        if(head != null){
            Node current = head.getNext();
            while(current != null){
                index++;
                if(current.getData().equals(o)){
                    return index;
                }
                current = current.getNext();
                if(current == null){
                    index = -1;
                }
            }
        }
        return index;
    }

    public SinglyLinkedList copy() {
        SinglyLinkedList copied = new SinglyLinkedList();
        if(head != null){
            Node current = head.getNext();
            while(current != null){
                copied.add(current.getData());
                current = current.getNext();
            }
        }
        return copied;
    }

}
