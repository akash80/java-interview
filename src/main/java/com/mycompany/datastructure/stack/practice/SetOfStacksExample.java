/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.stack.practice;

/**
 *
 * @author akash arora
 */
public class SetOfStacksExample {
    int stack[];
    int position = -1;
    int size;
    int stackNo;
    
    public SetOfStacksExample(int size, int stackNo){
        stack = new int[size];
        this.size = size;
        this.stackNo = stackNo;
    }
    
    void push(int val, int stack){
        ++position;
        if(position<size){
            
        }else{
            // create new stack
        }
    }
    
    public static void main(String args[]){
        SetOfStacksExample setOfStacksExample = new SetOfStacksExample(4,0);
        
    }
}
