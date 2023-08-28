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
public class Phone extends Device{
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public Phone(String brand, String model) {
//        super();
        this.brand = brand;
        this.model = model;
    }
}
