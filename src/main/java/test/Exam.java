/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author admin
 */
public class Exam {
    public static void main(String args[]){
        print(10);
    }
    
    public static void print(int length){
        int first = 0;
        int sec = 1;
        if(length == 1){
            System.out.println(0);
            return;
        }
        if(length == 2){
            System.out.println(0);
            System.out.println(1);
            return;
        }
        System.out.println(0);
         System.out.println(1);
        for(int i=2; i<length;i++){
            int num = first+sec;
            System.out.println(num);
            first = sec;
            sec = num;
            
        }
    }
}
