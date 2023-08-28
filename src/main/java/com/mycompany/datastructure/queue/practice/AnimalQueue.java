/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructure.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author akash arora
 */

// Animal class (base class)
class Animal {
    private String name;
    private long timestamp;

    public Animal(String name) {
        this.name = name;
        this.timestamp = System.nanoTime();
    }

    public String getName() {
        return name;
    }

    public long getTimestamp() {
        return timestamp;
    }
}

// Dog class (inherits from Animal)
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

// Cat class (inherits from Animal)
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

// AnimalQueue class
class AnimalQueue {
    private Queue<Animal> dogs;
    private Queue<Animal> cats;

    public AnimalQueue() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Dog) {
            dogs.offer(animal);
        } else if (animal instanceof Cat) {
            cats.offer(animal);
        }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            return null; // No animals available
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            if (dogs.peek().getTimestamp() < cats.peek().getTimestamp()) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }
    }

    public Dog dequeueDog() {
        if (dogs.isEmpty()) {
            return null; // No dogs available
        }
        return (Dog) dogs.poll();
    }

    public Cat dequeueCat() {
        if (cats.isEmpty()) {
            return null; // No cats available
        }
        return (Cat) cats.poll();
    }
}
