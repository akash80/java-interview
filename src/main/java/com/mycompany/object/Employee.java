/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.object;

import java.util.Objects;

/**
 *
 * @author akash arora
 */
public final class Employee implements Cloneable, Comparable<Employee>{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + '}';
    }
    
    
}
