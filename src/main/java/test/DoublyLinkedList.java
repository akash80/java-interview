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
public class DoublyLinkedList {
    
    DoubleNode node;
//    Double LINKED LIST    
    void insert(int val){
        DoubleNode dn = new DoubleNode(val);
        if(node!=null){
            DoubleNode lastNode = getLastNode();
            lastNode.next = dn;
            dn.prev = lastNode;
        }else{
            node = dn;
        }
    }
    DoubleNode search(int val){
        DoubleNode dn = node;
        while(dn!=null){
            if(dn.value == val){
                return dn;
            }
            dn = dn.next;
        }
        return null;
    }
    DoubleNode getLastNode(){
        DoubleNode dn = node;
        while(dn.next!=null){
            dn = dn.next;
        }
        return dn;
    }
    
    public static void main(String args[]){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insert(5);
        dll.insert(4);
        dll.insert(6);
        dll.insert(2);
        
        DoubleNode dn = dll.search(4);
        System.out.println(dn.next.value);
    }
}
