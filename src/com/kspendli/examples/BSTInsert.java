package com.kspendli.examples;

public class BSTInsert {
    public static void main(String[] args) {
        BST bst = new BST();
         Node head = bst.createNode(10);
        bst.insertNode(head, 8);
        bst.insertNode(head, 23);
        bst.insertNode(head, 1);

        System.out.println(head);
    }
}

class BST{

    public Node createNode(int val){
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        return node;
    }

    public Node insertNode(Node node, int val){
        if(node == null){
            return createNode(val);
        }

        if(val < node.data){
            node.left = insertNode(node.left, val);
        }else if(val > node.data){
            node.right = insertNode(node.right, val);
        }
        return node;
    }
}

class Node{
    int data;
    Node left;
    Node right;
}