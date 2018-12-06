/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author HANIF
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    

    private Node root;
    
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root = insert(root,value);
    }
    
    public Node insert(Node r,int value){
        //Node node = new Node(value);
        if(r == null){
            r= new Node(value);               
        }
        else{
            if(value <=r.data)
                r.left = insert(r.left,value);
            else
                r.right = insert(r.right,value);
        }
        return r;
    }
    
    public boolean search(int value){
        return search(root, value);
    }
    
    public boolean search(Node r,int value){
        boolean found  = false;
        while((r != null) && !found){
        int rval = r.data;
        if(value <rval)
            r = r.left;
        else if(value> rval)
            r = r.right;
        else{
            found = true;
            break;
        }
        found = search(r,value);
    }
        return found;
    }
    
    public void inorder(){
        inorder(root);
    }
    
    public void inorder(Node r){
        if(r != null){
        inorder(r.left);
        System.out.print(r.data + " ");
        inorder(r.right);
    }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(7);
        binarySearchTree.insert(3);
        
        binarySearchTree.inorder();
        
        if(binarySearchTree.search(6)== true)
            System.out.print("Found data");
        
        if(binarySearchTree.search(10)== true){
            System.out.print("Found data");
        }
        if(binarySearchTree.search(15)== true){
            System.out.print("Found data");
        }
            
               
        binarySearchTree.inorder();
    }
    
}
