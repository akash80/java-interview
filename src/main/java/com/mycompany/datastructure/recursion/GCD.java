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
public class GCD {
    
    static int gcd(int a, int b){
        if(b>0){
            return gcd(b,a%b);
        }
        return a;
    }
    
    public static void main(String args[]){
        int result = gcd(42,36);
        System.out.println(result);
    }
}
