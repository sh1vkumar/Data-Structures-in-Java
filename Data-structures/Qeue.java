package com.company;

public class Qeue {
    int[] arr = null;
    int capacity = 4;
    int front =0;
    int rear =-1;
    public Qeue(){
        this.arr = new int[capacity];
    }
    public Qeue(int capacity){
        this.capacity = capacity;
        this.arr=new int[capacity];
    }
    public void enqeue(int data){
        if(rear+1 == capacity)
            System.out.println("Qeue is full");
        else{
            arr[++rear] = data;
            System.out.println(arr[rear]+" added Qeue");
        }
    }
    public void deQeue(){
        int data = arr[front];
        if(front == rear+1)
            System.out.println("Qeue is empty");
        else{
            for(int i=front;i<rear;i++){
                arr[i]=arr[i+1];
            }
            System.out.println(data+" removed from qeue");
            rear--;
        }
    }
    public int rear(){
        if(rear+1==capacity) {
            System.out.println("Queue is full");
            return Integer.MIN_VALUE;
        }
        else
            return arr[rear];
    }
    public int front(){
        if(front == rear+1) {
            System.out.println("Qeue is empty");
            return Integer.MIN_VALUE;
        }
        else
            return arr[front];
    }
    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
