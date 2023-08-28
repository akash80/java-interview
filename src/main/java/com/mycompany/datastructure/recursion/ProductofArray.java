/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.recursion;

/**
 *
 * @author admin
 */
public class ProductofArray {
    static int product(int[] array, int size){
        if(size>0){
            return array[size-1] * product(array, size-1);
        }
        return 1;
    }
    
    public static void main(String args[]){
        int[] ar = {1, 2, 3, 4, 5};
        int result = product(ar,ar.length);
        System.out.println(result);
    }
}
