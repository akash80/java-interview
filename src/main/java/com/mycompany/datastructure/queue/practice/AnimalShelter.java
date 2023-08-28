package com.mycompany.datastructure.queue.practice;

public class AnimalShelter {
    public static void main(String[] args) {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Beji"));
        animals.enqueue(new Cat("Reki"));
        animals.enqueue(new Dog("Dexter"));

        System.out.println(animals.dequeueAny().getName());
        System.out.println(animals.dequeueDog().getName());
        System.out.println(animals.dequeueAny().getName());
        System.out.println(animals.dequeueCat().getName());
    }
}
