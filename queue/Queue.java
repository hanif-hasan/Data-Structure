/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author HANIF
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    private static class Node{
        private int data;
        private Node next;
        
        private Node(int data){
            this.data = data;
        }
    }
    
    private Node head;
    private Node tail;
    
    public void add(int data){
        Node node = new Node(data);
        if(tail != null)
            tail.next = node;
        tail = node;
        if(head == null)
            head=node;
    }
    
    public void remove(){
         if(head != null)
            head = head.next;
        if(head == null)
            tail = null;
    }
    
    public int peek(){
        return head.data;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Queue queue = new Queue();
        queue.add(6);
        queue.print();
        queue.add(5);
        queue.add(4);
        queue.print();
        System.out.println(queue.peek());
        queue.remove();
        queue.print();
    }
    
}
