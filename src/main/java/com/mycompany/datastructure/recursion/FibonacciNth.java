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
public class FibonacciNth {
    
    static int element(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n==2){
            return 1;
        }
        return element(n-1)+element(n-2);
    }
    
    public static void main(String args[]){
        int result = element(28);
        System.out.println(result);
    }
}
