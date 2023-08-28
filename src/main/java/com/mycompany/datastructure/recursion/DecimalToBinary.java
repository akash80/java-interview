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
public class DecimalToBinary {
    
    static void binary(int n){
        if(n>1){
            System.out.println(n%2);
            binary(n/2);
        }else{
            System.out.println(n);
        }
    }
    
    public static void main(String args[]){
        binary(17);
    }
}
