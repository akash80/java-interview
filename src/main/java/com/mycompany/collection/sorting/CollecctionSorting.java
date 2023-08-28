/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collection.sorting;

import com.mycompany.object.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author akash arora
 */
public class CollecctionSorting {
    public static void main(String args[]){
       objectSortingWithComparator();
    }
    
    private static void basicSortingWithComparable(){
        // basic sorting 
       List<String> list = new ArrayList<>();
       list.add("d");
       list.add("c");
       list.add("b");
       list.add("a");
       Collections.sort(list);
       System.out.println(list);
       // using comparator for reverse sorting 
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
    }
    
    // implement comparable interface
    private static void objectSortingWithComparableInterface(){
        // basic sorting 
       List<Employee> list = new ArrayList<>();
       list.add(new Employee("rahul"));
       list.add(new Employee("akash"));
       list.add(new Employee("rajan"));
       list.add(new Employee("suresh"));
       // using stream api
       List<Employee> listSortedByStream = list.stream().sorted().collect(Collectors.toList());
       System.out.println(listSortedByStream);
       // using Collections 
       Collections.sort(list, Collections.reverseOrder());
       System.out.println(list);
    }
    
    // using comparator
    private static void objectSortingWithComparator(){
        // basic sorting 
       char[] c = new char[2];
       String s = "akash";
       
       List<Employee> list = new ArrayList<>();
       list.add(new Employee("rahul"));
       list.add(new Employee("akash"));
       list.add(new Employee("rajan"));
       list.add(new Employee("suresh"));
       
       Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
       // using stream
       List<Employee> listSortedByStream = list.stream().sorted(comparator).collect(Collectors.toList());
       System.out.println(listSortedByStream);
        // using Collections 
       Collections.sort(list, comparator.reversed());
    }
}
