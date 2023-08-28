/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.misc;

/**
 *
 * @author akash arora
 */
public class Pyramid {
    // time complexity O(n*(2n)) => 0(n^2) drop constant 
    static void print(int height){
        int total = (2*height)-1;
        int spaces = total/2;
        int star = 1;
        for(int i=0; i<height;i++){ // time complexity O(n)
            System.out.print(" ".repeat(spaces)+"*".repeat(star));
        
            star +=2;
            spaces--;
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        print(10);
    }
}
