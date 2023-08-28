/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author akash arora
 */
public class JavaQueue {
    public static void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(7);
        queue.add(8);
        queue.poll();
        System.out.println(queue.peek());
    }
}
