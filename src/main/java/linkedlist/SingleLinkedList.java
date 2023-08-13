/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author admin
 */
public class SingleLinkedList {
    Node node;
    
    void insert(int val){
        Node n = new Node(val);
        if(node!=null){
            Node lastNode = getLastNode();
            lastNode.next = n;
        }else{
            node = n;
        }
    }
    
    Node getLastNode(){
        Node n = node;
        while(n.next!=null){
            n = n.next;
        }
        return n;
    }
    
    void removeElement(int val){
        Node n = node;
        Node lastNode = n;
        while(n!=null){
            if(n.value == val){
                n = n.next;
                lastNode.next = n;
            }else{
                lastNode = n;
                n = n.next; 
            }
        }
    }
    
    void insertAt(int val, int before){
        
        Node nd = new Node(val);
        Node n  = node;
        Node lastNode = n;
        
        while(n!=null){
           if(n.value == before){
               nd.next = n;
               lastNode.next = nd;
               break;
           }else{
               lastNode = n;
               n = n.next;
           }
        }
    }
    
    Node search(int val){
        Node n = node;
        while(n!=null){
            if(n.value == val){
                return n;
            }
            n = n.next;
        }
        return null;
    }
    
    void print(){
        Node n = node;
        while(n!=null){
            System.out.println(n.value);
            n = n.next;
        }
    }
    
    public static void main(String args[]){
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(7);
        linkedList.insert(8);
        linkedList.insert(9);
        linkedList.insertAt(6,7);
        linkedList.print();
//        Node n = linkedList.search(7);
//        System.out.println(n.value);
    }
}
