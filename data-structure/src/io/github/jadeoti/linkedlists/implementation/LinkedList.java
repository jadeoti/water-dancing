package io.github.jadeoti.linkedlists.implementation;

public class LinkedList<T> {
    private Node head;

    private class Node{
        T value;
        Node next;

        Node(T data){
            this.value = data;
            this.next = null;
        }
    }

    public void insert(T data){
        // create a new node;
        Node node = new Node(data);

        if(head == null){
            head = node;
        }else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
        }

    }

    public void deleteKey(T data){
        // if data is at the head
        if(data == head.value){
            Node newHead = head.next;
            head.next = null;
            head = newHead;
        }

        // if data is somewhere than the head
        Node current = head;
        Node previous = null;

        while(current != null && current.value != data){
            previous = current;
            current = current.next;
        }
        Node right = current.next;
        current.value = null;
        current.next = null;
        previous.next = right;

        // if data is not in list
    }

    public void deleteAtIndex(int index){

    }


}
