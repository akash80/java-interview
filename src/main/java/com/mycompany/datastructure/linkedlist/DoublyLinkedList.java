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
public class DoublyLinkedList {
    DoublyNode node;
    
    void insert(int val){
        DoublyNode dn =  new DoublyNode(val);
        if(node!=null){
            DoublyNode last = getLastNode();
            last.next = dn;
            dn.prev = last;
        }else{
            node = dn;
        }
    }
    
    DoublyNode getLastNode(){
        DoublyNode dn = node;
        while(dn.next!=null){
            dn = dn.next;
        }
        return dn;
    }
    
    DoublyNode search(int val){
        DoublyNode dn = node;
        while(dn!=null){
            if(dn.value == val){
                return dn;
            }
            dn = dn.next;
        }
        return null;
    }
    
    void remove(int val){
        DoublyNode dn = node;
        DoublyNode last = dn;
        if(dn.value == val){
            last = dn.next;
            last.prev = null;
            return;
        }
        while(dn!=null){
            if(dn.value == val){
                dn = dn.next;
                last.next = dn;
                dn.prev = last;
                break;
            }else{
                last = dn;
                dn = dn.next;
            }
        }
    }
    
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(2);
        dll.insert(3);
        dll.insert(4);
        dll.insert(5);
        dll.insert(6);
        dll.insert(7);
        dll.remove(2);
        DoublyNode dl = dll.search(3);
        System.out.println(dl.prev.value);
    }
}
