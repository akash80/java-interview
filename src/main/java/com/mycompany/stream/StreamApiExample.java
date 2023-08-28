/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author akash arora
 */
public class StreamApiExample {
    
    
    public static void main(String args[]){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","b"));
        // return first duplicate
        Optional<String> s1 = list.stream().filter(e -> Collections.frequency(list, e)>1).findFirst();
        // return first non duplicate
        Optional<String> s2 = list.stream().filter(e -> Collections.frequency(list, e)<2).findFirst();
        // convert list to map with count
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())); 
    }
}
