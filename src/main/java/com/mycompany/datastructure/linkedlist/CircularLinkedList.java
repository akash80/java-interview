/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.linkedlist;

/**
 *
 * @author akash arora
 */
public class CircularLinkedList {
    Node node;
    
    void insert(int val){
        Node n = new Node(val);
        if(node!=null){
            Node last = getLastNode();
            last.next = n;
            n.next = node;
        }else{
            node = n;
            n.next = node;
        }
    }
    
    Node getLastNode(){
        Node n = node;
        while(n.next!=node){
            n = n.next;
        }
        return n;
    }
    
    Node search(int val){
        Node n = node;
        do{
            if(n.value == val){
                return n;
            }
            n = n.next;
        }while(n!=node);
        return null;
    }
    
    void remove(int val){
        Node n = node;
        Node last = n;
        //  if first element to be remove
        if(n.value == val){
            while(last.next!=node){
                last = last.next;
            }
            node = n.next;
            last.next = node;
            return;
        }
        // for any other
        do{
            if(n.value == val){
                n = n.next;
                last.next = n;
                break;
            }else{
               last = n; 
               n = n.next; 
            }
        }while(n!=node);
    }
    
    public static void main(String args[]){
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(2);
        cll.insert(5);
        cll.insert(6);
        cll.insert(7);
        cll.insert(8);
        cll.insert(9);
        cll.remove(2);
        Node n = cll.search(9);
        System.out.println(n.next.value);
    }
}
