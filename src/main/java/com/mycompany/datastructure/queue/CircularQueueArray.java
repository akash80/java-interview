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
public class CircularQueueArray {
    int array[];
    int start;
    int lastPosition;
    int size;
    
    public CircularQueueArray(int size){
        array = new int[size];
        this.size = size;
        this.start = -1;
        this.lastPosition = -1;
    }
    
    void enQueue(int val){
        if(start<0){
             ++start; 
             ++lastPosition;
        }
        if(lastPosition-start<size){
            int position = lastPosition%size;
            array[position] = val;
            ++lastPosition;
        }else{
            System.out.println("enqueue Array is full");
        }
    }
    
    void deQueue(){
        if(lastPosition>start){
            start++;
        }else{
            System.out.println("dequeue array is empty");
        }
    }
    
    void peek(){
        if(isEmpty()){
             System.out.println(array[start%size]);
        }else{
            System.out.println("peek array is empty");
        }
       
    }
    
    boolean isEmpty(){
         if(start>=0 && start>=lastPosition)
             return false;
         else
             return true;
    }
    
    public static void main(String args[]){
        CircularQueueArray circularQueueArray = new CircularQueueArray(5);
        circularQueueArray.enQueue(4);
        circularQueueArray.enQueue(5);
        circularQueueArray.enQueue(6);
        circularQueueArray.enQueue(7);
        circularQueueArray.enQueue(8);
        circularQueueArray.enQueue(9);
        circularQueueArray.peek();
        circularQueueArray.deQueue();
        circularQueueArray.deQueue();
        circularQueueArray.deQueue();
        circularQueueArray.deQueue();
        circularQueueArray.deQueue();
        circularQueueArray.deQueue();
        circularQueueArray.peek();
        circularQueueArray.enQueue(12);
        circularQueueArray.enQueue(14);
        circularQueueArray.enQueue(16);
        circularQueueArray.enQueue(18);
        circularQueueArray.enQueue(19);
        circularQueueArray.deQueue();
        circularQueueArray.peek();
    }
}
