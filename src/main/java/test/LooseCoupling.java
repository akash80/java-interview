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
public class LooseCoupling {
    public static void main(String args[]){
        BinarySearch binarySearch = new BinarySearch(new BubbleSort());
        binarySearch.search(new int[]{2,4}, 4);
    }
}
