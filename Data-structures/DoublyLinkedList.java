package com.company;

public class DoublyLinkedList {
    int size =0;
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    public void firstNode(Node n){
        head = n;
        tail = n;
        head.prev = null;
        tail.next = null;
    }

    public void lastNode(Node n){
        tail.next = n;
        n.prev = tail;
        tail = n;
        tail.next = null;
    }

    public void addAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null) firstNode(newNode);
        else{
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
        size++;
    }

    public void addNewNode(int data){
        Node newNode = new Node(data);

        if(head == null) firstNode(newNode);
        else lastNode(newNode);
        size++;
    }

    public void addToSpecificPosition(int pos, int data){
        Node newNode = new Node(data);
        if(head == null) System.out.println("The specified location is not available");
        else if(pos == size+1) lastNode(newNode);
        else if(pos == 1) addAtBeginning(data);
        else{
            Node cur = head;
            Node temp = null;
            while(pos-- == 0)cur=cur.next;
            temp = cur.next;
            temp.prev = cur;
            cur.next = newNode;
            newNode.prev = cur;
            newNode.next = temp;
            temp.prev = newNode;
        }
    }
}
