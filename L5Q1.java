//Write a Java Program to define a class, describe its 
//constructor, overload the Constructors and instantiate its object.
public class L5Q1 {
    private String name;
    private int age;

    // Default constructor
    public L5Q1() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Overloaded constructor with one argument
    public L5Q1(String name) {
        this.name = name;
        this.age = 0;
    }

    // Overloaded constructor with two arguments
    public L5Q1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        L5Q1 obj1 = new L5Q1();
        L5Q1 obj2 = new L5Q1("Alice");
        L5Q1 obj3 = new L5Q1("Bob", 25);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
