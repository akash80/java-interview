/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.stack;

import com.mycompany.datastructure.linkedlist.Node;

/**
 *
 * @author akash arora
 */
public class StackWithLinkedList {
    Node node;
    void push(int val){
        Node n = new Node(val);
        if(node!=null){
            n.next = node;
            node = n;
        }else{
            node = n;
        }
    }
    void pop(){
        Node n = node;
        node = n.next;
    }
    void delete(){
        node = null;
    }
    void peek(){
        System.out.println(node.value);
    }
    void print(){
        Node last = node;
        while(last!=null){
            System.out.println(last.value);
            last = last.next;
        }
    }
    public static void main(String args[]){
         StackWithLinkedList linkedList = new StackWithLinkedList();
         linkedList.push(4);
         linkedList.push(5);
         linkedList.push(7);
         linkedList.push(8);
         linkedList.push(12);
         linkedList.pop();
         linkedList.peek();
         linkedList.print();
    }
}
