/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.practice;

import linkedlist.Node;


/**
 *
 * @author admin
 */
public class SinglyLinkedList {
    Node node;
    Node sortedNode;
    
    void insert(int val){
        Node n = new Node(val);
        if(node!=null){
            Node lastNode = getLast();
            lastNode.next = n;
        }else{
            node = n;
        }
    }
    
    Node getLast(){
        Node n = node;
        while(n.next!=null){
            n = n.next;
        }
        return n;
    }
    
    void print(){
        Node n = node;
        while(n!=null){
            System.out.println(n.value);
            n = n.next;
        }
    }
    
    // question 1
    void removeDuplicate(){
        Node n = node;
        while(n!=null){
            int val = n.value;
            n = n.next;
            Node newNode = n;
            Node lastNode = newNode;
            while(newNode!=null){
                if(newNode.value == val){
                    newNode = newNode.next;
                    lastNode.next = newNode;
                }else{
                    lastNode = newNode;
                    newNode = newNode.next;
                }
            }
        }
    }
    
// question 2
    Node returnNthFromLast(int nth){
        Node n = node;
        int count = 0;
        while(n!=null){
            count++;
            n = n.next;
        }
        int position = count-nth;
        Node n2 = node;
        int count2 = 0;
        while(n2!=null){
            if(count2 == position){
                return n2;
            }else{
                n2 = n2.next;
                count2++;
            }
        }
        return null;
    }
    
//    void partition(int val){
//        Node n = node;
//        node2 = new Node(n.value);
//        Node node2Last = node2;
//        while(n!=null){
//            Node last = n;
//            n = n.next;
//            if(n!=null){
//                if(n.value>=node2Last.value){
//                    node2Last = node2;
//                    node2.next = new Node(n.value);
//                    n = n.next;
//                }else{
//                    if(node2Last.value<=n.value){
//                        node2.next = new Node(n.value);
//                        n = n.next;
//                    }else{
//                        
//                    }
//                }
//            }
//        }
//    }
    
    Node sort(){
        Node n = node;
        Node last = node;
        Node sorted = null;
        while(n.next!=null){
            if(n.next.value<n.value){
                if(sorted == null){
                    Node newSorted = new Node(n.next.value);
                    newSorted.next = new Node(n.value);
                    sorted = newSorted;
                    n = n.next;
                }else{
                    Node sortedLast = sorted.next;
                    sorted.next = new Node(n.next.value);
                    sorted = sorted.next;
                    sorted.next = sortedLast;
                    n = n.next;
                }
            }else{
                if(sorted == null){
                    Node newSorted = new Node(n.next.value);
                    newSorted.next = new Node(n.value);
                    sorted = newSorted;
                    n = n.next;
                }else{
                    sorted.next = new Node(n.next.value);
                    n = n.next;
                }
            }
        }
        return sorted;
    }
    
    void sort2(){
        Node n = node;
        sortedNode = new Node(n.value);
        Node last = sortedNode;
        n = n.next;
        while(n!=null){
            Node newNode = new Node(n.value);
            if(n.value<getLastElementSorted().value){
                Node temp = getLastElementSorted();
                last = getLastSecondElementSorted();
                last.next = newNode;
                newNode.next = temp;
                n = n.next;
            }else{
                last = getLastElementSorted();
                last.next = newNode;
                n = n.next;
            }
        }
    }
    
    Node getLastElementSorted(){
        Node n = sortedNode;
        while(n.next!=null){
            n = n.next;
        }
        return n;
    }
    
    Node getLastSecondElementSorted(){
        Node n = sortedNode;
        while(n.next.next!=null){
            n = n.next;
        }
        return n;
    }
    
    void printSorted(){
        Node n = sortedNode;
        while(n!=null){
            System.out.println(n.value);
            n = n.next;
        }
    }
    
    void rotate(int position){
        Node n = node;
        Node n1 = new Node(n.value);
        n = n.next;
        Node n2 = null;
        int count = 1;
        while(n!=null){
            if(count < position){
                while(n1.next!=null){
                    n1 = n1.next;
                }
                n1.next = new Node(n.value);
                n = n.next;    
                count++;
            }else{
                node = n;
                n2 = node;
                while(n2.next!=null){
                    n2 = n2.next;
                }
                while(n1!=null){
                    while(n2.next!=null){
                       n2 = n2.next;
                    }
                    n2.next = new Node(n1.value);
                    n1 = n1.next;
                }
              
                break;
            }
        }
        while(node!=null){
            System.out.println(node.value);
            node = node.next;
        }
    }
    
    boolean insertAt(int position, int val){
        Node n = node;
        int p = 0;
        while(n!=null){
            if(p >= (position-1)){
                Node newN = new Node(val);
                Node  temp = n.next;
                n.next = newN;
                newN.next = temp;
                return true;
            }
            p++;
            n = n.next;
        }
        return false;
    }
    
    public static void main(String args[]){
        SinglyLinkedList rd = new SinglyLinkedList();
        rd.insert(1);
        rd.insert(3);
        rd.insert(5);
        rd.insert(4);
        rd.insert(2);   
        rd.insert(9);
        rd.insertAt(2, 6);
//        rd.rotate(2);
//        Node n = rd.returnNthFromLast(5);
//        System.out.println(n.value);
//        rd.removeDuplicate();
//        rd.sort2();
//        rd.printSorted();
        rd.print();
    }
}
