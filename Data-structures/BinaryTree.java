package com.company;

public class BinaryTree {
    static class Node {
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left =null;
            right=null;
        }
    }
    public void insertNode(Node node,int data){
        if(data<node.data){
            if(node.left!=null)
                insertNode(node.left,data);
            else{
                System.out.println("Inserted "+data+" to the left of "+node.data);
                node.left = new Node(data);
            }
        }
        else if(data>node.data){
            if(node.right!=null)
                insertNode(node.right,data);
            else{
                System.out.println("Inserted "+data+" to the right of "+node.data);
                node.right = new Node(data);
            }
        }
    }
    public void traverseInOrder(Node node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(10);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.data);
        tree.insertNode(root, 2);
        tree.insertNode(root, 12);
        tree.insertNode(root, 21);
        tree.insertNode(root, 5);
        tree.insertNode(root, 7);
        tree.insertNode(root, 15);
        tree.insertNode(root, 1);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);

    }
}
