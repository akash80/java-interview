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
public class RecursiveRangeSum {
    
    static int sum(int n){
        if(n>1){
            return n+sum(n-1);
        }
        return 1;
    }
    
    public static void main(String args[]){
        int result = sum(10);
        System.out.println(result);
    }
}
