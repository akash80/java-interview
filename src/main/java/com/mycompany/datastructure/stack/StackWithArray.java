/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.stack;

/**
 *
 * @author akash arora
 */
public class StackWithArray {
    int array[];
    int lastPosition;
    int maxSize;
    public StackWithArray(int size){
        array = new int[size];
        lastPosition = -1;
        maxSize = size;
    }
    void push(int val){
        if(lastPosition<maxSize-1){
            ++lastPosition;
            array[lastPosition] = val;
        }else{
            System.out.println("ArrayOutOfBound");
        }
    }
    void pop(){
        if(lastPosition>=0){
            --lastPosition;
        }else{
            System.out.println("No element found to remove");
        }
    }
    void print(){
        for(int i=0; i<=lastPosition; i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String args[]){
        StackWithArray array = new StackWithArray(10);
        array.push(2);
        array.push(4);
        array.push(5);
        array.push(6);
        array.pop();
        array.print();
    }
}
