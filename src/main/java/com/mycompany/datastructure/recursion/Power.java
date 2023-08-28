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
public class Power {
    static int calculate(int number, int power){
        if(power>0){
            return number*calculate(number, (power-1));
        }
        return 1;
    }
    
    public static void main(String args[]){
        int result = calculate(2, 8);
        System.out.println(result);
    }
}
