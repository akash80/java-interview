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
public class PhoneBuilder {
    private String brand;
    private String model;
    
    public PhoneBuilder setBrand(String brand){
        this.brand = brand;
        return this;
    }
    
    public PhoneBuilder setModel(String model){
        this.model = model;
        return this;
    }
    
    public Phone getPhone(){
        return new Phone(brand, model);
    }
}
