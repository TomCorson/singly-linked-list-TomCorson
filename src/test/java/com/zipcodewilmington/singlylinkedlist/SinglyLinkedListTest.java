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
    public void testAdd2(){
        singlyLinkedList.add("A");
        singlyLinkedList.add("C");
        singlyLinkedList.add("B",1);
        Object expected = "ABC";
        Object actual = singlyLinkedList.toString();
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
        singlyLinkedList.add("1");
        singlyLinkedList.add("2");
        singlyLinkedList.add("3");
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
        singlyLinkedList.add("Z");
        singlyLinkedList.add("e");
        singlyLinkedList.add("d");
        boolean expected = true;
        boolean actual = singlyLinkedList.contains("d");
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
        list1.add("d");
        list1.add("o");
        list1.add("g");
        SinglyLinkedList expected = list1;
        SinglyLinkedList actual = list1.copy();
        assertTrue(expected.containsAll(actual));
    }
    @Test
    public void testContainsAll2(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add("q");
        list1.add("a");
        list1.add("c");
        SinglyLinkedList expected = list1;
        SinglyLinkedList actual = list1.copy();
        assertTrue(expected.containsAll(actual));
    }
    @Test
    public void testsort(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add("b");
        list1.add("a");
        list1.add("c");
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list1.sort();
        String expected = list2.toString();
        String actual = list1.toString();
        assertEquals(expected,actual);
    }
    @Test
    public void testsort2(){
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add("c");
        list1.add("b");
        list1.add("a");

        list2.add("a");
        list2.add("b");
        list2.add("c");
        list1.sort();
        String expected = list2.toString();
        String actual = list1.toString();
        assertEquals(expected,actual);
    }



}
