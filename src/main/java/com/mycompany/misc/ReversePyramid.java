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
public class ReversePyramid {
    static void print(int height){
        int star = (2*height)-1;
        int spaces = 0;
        for(int i=0; i<height;i++){
            System.out.print(" ".repeat(spaces)+"*".repeat(star));
            spaces++;
            star -=2;
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        print(4);
    }
}
