package com.mycompany.tree;

public class BinaryTree {
 
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);

    }

    private Node insertRec(Node root, int value) {
        if (root == null) {// if root isEmpty 
            return new Node(value);//if value is lessthan whats in the root 
        }
        if (value < root.value) {//if value is greaterthan value in the root    
            root.left = insertRec(root.left,value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
    }
    public void preorderTransversal(){
        preorderRec(root);
    }
    public void postTransversal(){
        postRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value + " ");
            inorderRec(root.right);
        }}
    private void preorderRec(Node root){
        if (root != null){
            System.out.println(root.value+" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }}
    private void postRec(Node root){
        if (root !=null){
            postRec(root.left );
            postRec(root.right);
            System.out.println(root.value+" ");
            
        }
    }
}

    


