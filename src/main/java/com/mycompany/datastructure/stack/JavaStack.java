/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.stack;

import java.util.Stack;

/**
 *
 * @author akash arora
 */
public class JavaStack {
    public static void  main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(6);
        stack.push(8);
        stack.pop();
        System.out.println(stack);
    }
}
