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
public class LinkedList2 {
    
    Node node;
    
//    SINGLE LINKED LIST
    public void insert(int val){
        Node n = new Node(val);
        if(node!=null){
            Node last = getLastNode();
            last.next = n;
        }else{
            node = n;
        }
    }
    public Node search(int val){
        Node n = node;
        while(n!=null){
            if(n.value == val){
                return n;
            }
            n = n.next;
        }
        return null;
    }
    public Node getLastNode(){
        Node n = node;
        while(n.next!=null){
            n = n.next;
        }
        return n;
    }
    
    public static void main(String args[]){
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.insert(4);
        linkedList2.insert(2);
        linkedList2.insert(6);
        linkedList2.insert(8);
        linkedList2.insert(1);
        Node search = linkedList2.search(4);
        System.out.println(search);
    }
}