package com.company;

public class SinglyLinkedList {
    public Node head =null;

    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addAtbeginning(int data){
        Node newNode = new Node(data);

        if(this.head ==null){
            this.head = newNode;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }
     public void addAtEnd(int data){
        Node newNode = new Node(data);

         if(this.head == null) this.head = newNode;
         else{
             Node cur = this.head;
             while(cur.next!= null)cur = cur.next;
             cur.next = newNode;
         }
     }

     public void addAtPosition(int position,int data){
        Node newNode = new Node(data);
        Node cur = this.head,prev = this.head;
        if(position ==1){
            newNode.next = this.head;
            this.head = newNode;
        }
        else{
            while(cur.next!= null && --position>0){
                prev = cur;
                cur = cur.next;
            }
            prev.next = newNode;
            newNode.next = cur;
        }
     }

     public void print(){
        Node cur = this.head;
         System.out.println("Elements in the linked list:");
        while(cur!=null){
            System.out.print(cur.data+" ->");
            cur = cur.next;
        }
         System.out.print("NULL\n");
     }

     public void deleteData(int data) {
         Node cur = this.head, prev = this.head;

         if (this.head == null) {
             System.out.println("The List is empty\n");
             return;
         }
         if (this.head.data == data) {
             this.head = this.head.next;
             return;
         } else {
             while (cur.next != null && cur.data != data) {
                 prev = cur;
                 cur = cur.next;
             }
             if (cur.next!= null) prev.next = cur.next;
             else System.out.println("Element " + data + " not found in the list");
         }
     }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Created a singly linked list .....");
        for (int i=1;i<=8;i++) {
            list.addAtbeginning(i);
        }
        list.print();
        list.deleteData(1);
        list.print();
        list.deleteData(8);
        list.print();
        list.deleteData(4);
        list.print();
    }
}

