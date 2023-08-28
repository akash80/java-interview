/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern.creational.singleton;

/**
 *
 * @author akash arora
 */
// there will be only one instance for each application context 
public class SingletonClass {
    private static SingletonClass instance;
    private int count;

    public static SingletonClass getInstance() {
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
    
    
    
    int getCount(){
        return count;
    }
    
    void addCount(){
        count++;
    }
    
    void removeCount(){
        count--;
    }
    
    private SingletonClass(){
        count = 0;
    }
    
    public static void main(String args[]){
        SingletonClass s1 = SingletonClass.getInstance();
        s1.addCount();
        s1.addCount();
        System.out.println(s1.getCount());
        SingletonClass s2 = SingletonClass.getInstance();
        s2.addCount();
        System.out.println(s2.getCount());
    }
}
