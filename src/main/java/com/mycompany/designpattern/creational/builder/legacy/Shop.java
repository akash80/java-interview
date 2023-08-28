/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern.creational.builder.legacy;

/**
 *
 * @author akash arora
 */
public class Shop {
    public static void main(String args[]){
        Phone p = new PhoneBuilder().setBrand("Apple").getPhone();
    }
}
