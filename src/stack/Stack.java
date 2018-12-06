/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author HANIF
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    private static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
        }
    }
    
    private Node top;
    
    public boolean isEmpty(){
        return top==null;              //if top = null return true
    }
    
    public void push(int data){        //prepanding linked list
        Node node = new Node(data);
        node.next= top;
        top = node;
    }
    
    public int peek(){
        return top.data;
    }
    
    public void pop(){
        top = top.next;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        
        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
    }
    
}
