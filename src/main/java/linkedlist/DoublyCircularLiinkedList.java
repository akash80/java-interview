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
public class DoublyCircularLiinkedList {
    DoublyNode node;
    
    void insert(int val){
        DoublyNode dn = new DoublyNode(val);
        if(node!=null){
            DoublyNode last = getLastNode();
            last.next = dn;
            dn.prev = last;
            dn.next = node;
            node.prev = dn;
        }else{
            node = dn;
            dn.prev = node;
            dn.next = node;
        }
    }
    
    DoublyNode getLastNode(){
        DoublyNode dn = node;
        while(dn.next!=node){
            dn = dn.next;
        }
        return dn;
    }
    
    DoublyNode search(int val){
        DoublyNode dn = node;
        do{
            if(dn.value == val){
                return dn;
            }
            dn = dn.next;
        }while(dn!=node);
        return null;
    }
    
    public static void main(String args[]){
        DoublyCircularLiinkedList dcll = new DoublyCircularLiinkedList();
        dcll.insert(2);
        dcll.insert(4);
        dcll.insert(6);
        dcll.insert(7);
        dcll.insert(8);
        DoublyNode dn = dcll.search(2);
        System.out.println(dn.prev.value);
    }
}
