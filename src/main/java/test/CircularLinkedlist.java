/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author admin
 */
public class CircularLinkedlist {
    Node node;
//    Circular LINKED LIST
    void insert(int val){
        Node n = new Node(val);
        if(node!=null){
            Node lastNode = getLastNode();
            lastNode.next = n;
            n.next = node;
        }else{
            node = n;
            n.next = node;
        }
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
    Node getLastNode(){
        Node n = node;
        while(n.next!=node){
            n = n.next;
        }
        return n;
    }
    
    public static void main(String args[]){
        CircularLinkedlist circularLinkedlist = new CircularLinkedlist();
        circularLinkedlist.insert(4);
        circularLinkedlist.insert(2);
        circularLinkedlist.insert(6);
        circularLinkedlist.insert(8);
        circularLinkedlist.insert(1);
        Node n = circularLinkedlist.search(8);
        System.out.println(n.value);
    }
}
