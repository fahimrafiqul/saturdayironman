package com.upskill.assignment_3;

class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();  // Polymorphic reference to a Dog object
        Animal animal2 = new Cat();  // Polymorphic reference to a Cat object

        animal1.sound(); // Calls Dog's sound() method
        animal2.sound(); // Calls Cat's sound() method
    }



	}


