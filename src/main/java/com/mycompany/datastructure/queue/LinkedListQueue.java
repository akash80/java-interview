/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.queue;

import com.mycompany.datastructure.linkedlist.Node;

/**
 *
 * @author akash arora
 */
public class LinkedListQueue {
    Node node;
    Node tail;
    
    void enQueue(int val){
        Node n = new Node(val);
        if(node!=null){
            tail.next = n;
            tail = n;
        }else{
            node = n;
            tail = node;
        }
    }
    
    void deQueue(){
        node = node.next;
    }
    
    int peek(){
        return node.value;
    }
    
    void print(){
        Node n = node;
        while(n!=null){
            System.out.println(n.value);
            n = n.next;
        }
    }
    
    public static void main(String args[]){
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enQueue(3);
        linkedListQueue.enQueue(4);
        linkedListQueue.enQueue(5);
        linkedListQueue.enQueue(6);
        linkedListQueue.deQueue();
        linkedListQueue.print();
    }
}
