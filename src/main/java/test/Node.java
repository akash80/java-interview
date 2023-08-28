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
public class Node {
    Node next;
    int value;
    
    public Node(int val){
        value = val;
    }

    @Override
    public String toString() {
        return "node: "+next+", value: "+value;
    }
    
    
}
