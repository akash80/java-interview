/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.queue.practice;

import java.util.Stack;

/**
 *
 * @author akash arora
 */
public class QueueByTwoStack<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();
    
    void enqueue(T t){
        stack1.push(t);
    }
    
    T dequeue(){
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    
    public static void main(String args[]){
        QueueByTwoStack<Integer> q = new QueueByTwoStack<>();
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(8);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
