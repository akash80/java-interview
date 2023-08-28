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
public class Factorial {
    static int fectorial(int number){
        if(number>0){
            if(number == 0 || number == 1){
                return 1;
            }
            return number * fectorial(number-1);
        }
        return -1;
    }
    
    public static void main(String args[]){
        int result = fectorial(5);
        System.out.println(result);
    }
}
