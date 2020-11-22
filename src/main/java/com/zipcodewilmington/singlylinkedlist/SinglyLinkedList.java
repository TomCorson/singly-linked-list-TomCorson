package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private static int counter;
    private Node head;

    public SinglyLinkedList() {
    }

    public void add(String data) {
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

    public void add(String data, int index){
        Node temp = new Node(data);
        Node current = head;
        if(current != null){
            for(int i = 0; i < index && current.getNext() != null; i++){
                current = current.getNext();
            }
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String get(int index) {
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

    public boolean contains(String o){
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

    public Integer find(String o) {
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
    public void sort() {
        Integer length = this.size()-1;
        boolean isSwapped;

        for(int j = 0; j < length; j++) {
            isSwapped = false;
                for (int i = 0; i < length-j; i++) {
                    if (this.get(i+1) != null) {
                        if (this.get(i).compareTo(this.get(i+1)) > 0) {
                            String current = this.get(i);
                            String next = this.get(i + 1);

                            String temp = current;
                            this.remove(i);
                            this.add(next, i);
                            if (this.get(i + 2) != null) {
                                this.remove(i + 2);
                                isSwapped = true;
                            }
                            else{
                                this.remove(i+1);
                                this.add(temp,2);
                            }
                        }
                    }
                }
            if(!isSwapped){
                break;
            }

        }
    }

}
