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
public class Node {
    public Node next;
    public int value;
    
    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "node: "+next+", value: "+value;
    }
    
    
}
