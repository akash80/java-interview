/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.stack.practice;

/**
 *
 * @author akash arora
 * Creating 3 stack from single array
 */
public class StackExample {
    int[] array;
    int p1 = -1;
    int p1Size;
    int p2 = -1;
    int p2Size;
    int p3 = -1;
    int p3Size;
    
    public StackExample(int size1, int size2, int size3){
        array = new int[size1+size2+size3];
        p2 = p1+size1;
        p3 = p2+size2;
        p1Size = size1;
        p2Size = size2;
        p3Size = size3;
    }
    
    void push(int val, int arrayNumber){
        switch(arrayNumber){
            case 1 -> {
                p1++;
                array[p1] = val;
            }
            case 2 -> {   
                p2++;
                array[p2] = val;
            }
            case 3 -> {
                p3++;
                array[p3] = val;
            }
        }
    }
    
    void pop(int arrayNumber){
        switch(arrayNumber){
            case 1 -> {
                if(p1>-1)
                    p1--;
            }
            case 2 -> {   
                if(p2>p1Size)
                    p2--;
            }
            case 3 -> {
                if(p3>p2Size)
                    p3--;
            }
        }
    }
    
    void peek(int arrayNumber){
        switch(arrayNumber){
            case 1 -> {
                System.out.println(array[p1]);
            }
            case 2 -> {
                 System.out.println(array[p2]);
            }
            case 3 -> {
                 System.out.println(array[p3]);
            }
        }
    }
    
    public static void main(String args[]){
          StackExample example = new StackExample(3, 4, 5);
          example.push(4, 1);
          example.push(5, 1);
          example.push(2, 2);
          example.push(1, 2);
          example.push(6, 3);
          example.push(7, 3);
          example.push(8, 3);
          example.pop(3);
          example.peek(3);
    }
}
