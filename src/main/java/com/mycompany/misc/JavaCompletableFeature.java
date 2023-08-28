/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.misc;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 *
 * @author admin
 */
public class JavaCompletableFeature {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(5,9,14);  
        list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num))).map(CompletableFuture->CompletableFuture.thenApply(n->n)).map(t->t.join()).forEach(s->System.out.println(s));  
    }
    
    public static int getNumber(int number){
        return 7;
    }
}
