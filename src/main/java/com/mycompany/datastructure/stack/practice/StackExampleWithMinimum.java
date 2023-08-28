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
public class StackExampleWithMinimum {
    int[] array;
    int position = -1;
    int size;
    int[] minArray;
    
    public StackExampleWithMinimum(int size){
        array = new int[size];
        minArray = new int[size]; 
        this.size = size;
        
    }
    
    void push(int val){
        ++position;
        if(position<size){
            array[position] = val;
            if (position == 0 || val < minArray[position - 1]) {
                minArray[position] = val; // Update minimum stack only if val is smaller
            } else {
                minArray[position] = minArray[position - 1]; // Maintain the previous minimum
            }
        }else{
            System.out.println("Array is full");
        }
    }
    
    void pop(){
        if(position>=0){
            position--;
        }else{
            System.out.println("Array is empty");
        }
    }
    
    void min(){
        if(minArray.length>0){
            System.out.println(minArray[position]);
        }else{
            System.out.println("Array is empty");
        }
    }
    
    public static void main(String args[]){
        StackExampleWithMinimum exampleWithMinimum = new StackExampleWithMinimum(5);
        exampleWithMinimum.push(6);
        exampleWithMinimum.push(4);
        exampleWithMinimum.push(5);
        exampleWithMinimum.push(3);
        exampleWithMinimum.push(1);

        exampleWithMinimum.min(); // Should print 1 (current minimum)
        exampleWithMinimum.pop();
        exampleWithMinimum.pop();
        exampleWithMinimum.pop();
        exampleWithMinimum.min(); // Should print 5 (current minimum)
    }
}
