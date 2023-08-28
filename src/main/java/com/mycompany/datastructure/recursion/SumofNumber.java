/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.recursion;

/**
 *
 * @author akash arora
 */
public class SumofNumber {
    static int sum(int number){
        if(number<10){
            return number;
        }
        int rem = number%10;
        int n = number/10;
        return rem+sum(n);
    }
    
    public static void main(String args[]){
        int s = sum(101091123);
        System.out.println(s);
    }
}
