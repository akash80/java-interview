/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.queue;

/**
 *
 * @author akash arora
 */
public class LinearQueueArray {
    int[] array;
    int position;
    int start;
    int size;
    
    public LinearQueueArray(int size){
        array = new int[size];
        this.size = size;
        position = -1;
        start = 0;
    }
    
    void enQueue(int val){
        position++;
        array[position] = val;
    }
    
    void deQueue(){
        start++;
    }
    
    void print(){
        for(int i = start; i<=position; i++){
            System.out.println(array[i]);
        }
    }
    
    public static void main(String argsp[]){
        LinearQueueArray linearQueueArray = new LinearQueueArray(5);
        linearQueueArray.enQueue(3);
        linearQueueArray.enQueue(5);
        linearQueueArray.enQueue(6);
        linearQueueArray.enQueue(8);
        linearQueueArray.deQueue();
        linearQueueArray.print();
    }
}
