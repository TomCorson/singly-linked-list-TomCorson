package com.zipcodewilmington.singlylinkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    @Test
    public void testAdd(){
        singlyLinkedList.add("A");
        Object expected = "A";
        Object actual = singlyLinkedList.get(0);
        assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("B");
        singlyLinkedList.add("C");
        singlyLinkedList.remove(2);
        Object expected = null;
        Object actual = singlyLinkedList.get(2);
        assertEquals(expected,actual);
    }
    @Test
    public void testRemove2(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("B");
        singlyLinkedList.add("C");
        boolean expected = true;
        boolean actual = singlyLinkedList.remove(2);
        assertEquals(expected,actual);
    }
    @Test
    public void testToString(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("B");
        singlyLinkedList.add("C");
        String expected = "ABC";
        String actual = singlyLinkedList.toString();
        assertEquals(expected,actual);
    }
    @Test
    public void testToString2(){
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        String expected = "123";
        String actual = singlyLinkedList.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testContains(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("B");
        singlyLinkedList.add("C");
        boolean expected = true;
        boolean actual = singlyLinkedList.contains("C");
        assertEquals(expected,actual);
    }
    @Test
    public void testContains2(){
        singlyLinkedList.add(1.5);
        singlyLinkedList.add(9.9);
        singlyLinkedList.add(-1.2);
        boolean expected = true;
        boolean actual = singlyLinkedList.contains(-1.2);
        assertEquals(expected,actual);
    }
    @Test
    public void testFind(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("B");
        singlyLinkedList.add("C");
        Integer expected = 1;
        Integer actual = singlyLinkedList.find("B");
        assertEquals(expected,actual);
    }
    @Test
    public void testFind2(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("B");
        singlyLinkedList.add("C");
        Integer expected = -1;
        Integer actual = singlyLinkedList.find("D");
        assertEquals(expected,actual);
    }
    @Test
    public void testCopy(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        SinglyLinkedList expected = list1;
        SinglyLinkedList actual = list1.copy();
        assertTrue(expected.containsAll(actual));
    }
    @Test
    public void testContainsAll(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        SinglyLinkedList expected = list1;
        SinglyLinkedList actual = list1.copy();
        assertTrue(expected.containsAll(actual));
    }



}
