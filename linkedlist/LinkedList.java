/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author HANIF
 */



public class LinkedList {

    /**
     * @param args the command line arguments
     */
    
    Node head;
    
    public void append(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    
    public void prepend(int data){
        Node NewHead = new Node(data);
        NewHead.next = head;
        head = NewHead;
    }
    
    public void nthAdd(int position, int data){
        Node current = head;
        for(int i = 1; i< position-1 ; i++){
            current = current.next;
        }
        Node temp = new Node(data);
        temp.next = current.next;
        current.next= temp;
    }
    
    public void deleteWithValue(int data){
        if(head == null)
            return;
        
        if(head.data == data){
            head= head.next;
            return;
        }
        
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public void print(){
        if(head == null)
            return;
        Node current = head;
        while(current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
    }
    
    public void preDelete(){
        if(head == null) return;
        head = head.next;
    }
    
     public void postDelete(){
        if(head == null) return;
        if(head.next == null){
            head= null;
            return;
        }
        
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
     
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList linkedList = new LinkedList();
        
        linkedList.print();
        linkedList.preDelete();
        linkedList.postDelete();
        linkedList.print();
        linkedList.append(5);
        linkedList.append(8);
        linkedList.print();
        linkedList.append(4);
        linkedList.print();
        linkedList.append(7);
        linkedList.print();
        linkedList.prepend(1);
        linkedList.print();
        linkedList.deleteWithValue(4);
        linkedList.print();
        linkedList.preDelete();
        linkedList.print();
        linkedList.postDelete();
        linkedList.print();
        
        linkedList.append(5);
        linkedList.append(8);
        linkedList.nthAdd(2, 11);
        linkedList.print();
        
    }
    
}
