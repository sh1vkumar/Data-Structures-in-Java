package com.company;

public class Stack {
    int[] arr =null;
    int capacity = 5;
    int top=-1;

    public Stack() {
        this.arr = new int[capacity];
    }

    public Stack(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
    }
    public void push(int data) {
        if(top+1 == capacity) {
            System.out.println("Stack is full");
        }
        else{
            arr[++top] = data;
            System.out.println(arr[top]+" has been added");
        }

    }
    public void pop(){
        if(top==-1) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top--]+" has been removed");
        }

    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println("arr["+i+"] ="+arr[i]);
        }
    }
}
