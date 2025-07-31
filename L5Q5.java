//Write a Java Program to define a class, define instance methods 
//and override them and use them for dynamic method invocation. 
//[Hint: Inheritance and Polymorphism]
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class L5Q5 {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // dynamic method invocation
        Animal a2 = new Cat();

        a1.sound(); // prints "Dog barks"
        a2.sound(); // prints "Cat meows"
    }
}
