/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author akash arora
 */
public class DoublyCircularLinkedList {
    DoubleNode node;
//    Circular Doubly LINKED LIST
    void insert(int val){
        DoubleNode dn = new DoubleNode(val);
        if(node!=null){
            DoubleNode lastNode = getLastNode();
            lastNode.next = dn;
            dn.prev = lastNode;
            dn.next = node;
        }else{
            node = dn;
            dn.next = node;
            dn.prev = node; 
        }
    }
    DoubleNode search(int val){
        DoubleNode dn = node;
        do{
            if(dn.value == val){
                return dn;
            }
            dn = dn.next;
        }while(dn!=node);
        return null;
    }
    DoubleNode getLastNode(){
        DoubleNode dn = node;
        while(dn.next!=node){
            dn = dn.next;
        }
        return dn;
    }
    
    public static void main(String args[]){
        DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
        dcll.insert(5);
        dcll.insert(2);
        dcll.insert(6);
        dcll.insert(1);
        dcll.insert(9);
        DoubleNode dn = dcll.search(9);
        System.out.println(dn.value);
    }
}
