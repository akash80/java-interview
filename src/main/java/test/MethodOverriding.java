/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.math.BigInteger;

/**
 *
 * @author akash arora
 */
public class MethodOverriding extends SuperClass{
    int i = 20;
    
    public static void main(String args[]){
        SuperClass methodOverriding = new MethodOverriding();
//        methodOverriding.intTest(2222);
        methodOverriding.testPublic();
        System.out.println(methodOverriding.i);
    }
    
    public static void staticPublic(){
        System.out.println("Public static child");
    }
    
    public void testPublic(){
        System.out.println("Public Super child");
    }
    
    void test(){
        super.test();
        System.out.println("Super child");
    }
    
    private void intTest(int a){
        System.out.println("this is int");
    }
    
    private void intTest(Integer a){
        System.out.println("this is int");
    }
    
    private void intTest(short a){
        System.out.println("this is int");
    }
    
    private void intTest(long a){
        System.out.println("this is int");
    }
    
    private void intTest(double a){
        System.out.println("this is int");
    }
    
    private void intTest(float a){
        System.out.println("this is int");
    }
}
