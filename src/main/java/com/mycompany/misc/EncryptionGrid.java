/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.misc;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class EncryptionGrid {
    static String encrypt(String s){
        // removing spaces
        String trim = s.replace(" ", "");
        // calculate length
        int length = trim.length();
        double sqrt = Math.sqrt(length);
        int row = (int)Math.floor(sqrt);
        int coloumn = (int)Math.ceil(sqrt);
        String[] array = new String[row]; 
        int start = 0;
        int last = coloumn;
        for(int i=0; i<row; i++){
            array[i] = trim.substring(start, (last<length?last:(length)));
            System.out.println(array[i]);
            start = start+coloumn;
            last = last+coloumn;
        }
        String res = "";
        int count = 0;
        for(int i=0; i<array[0].length();i++){
            for(int j=0; j<array.length;j++){
                count++;
                if(count<=trim.length()){
                   res = res + array[j].charAt(i); 
                }
            }   
            if(count<trim.length()){
                res = res + " ";
            }
        }
        return res;
    }
    
    public static void main(String args[]){
        String res = encrypt("if men was meant to stay on the round");
        System.out.println(res);
    }
}
