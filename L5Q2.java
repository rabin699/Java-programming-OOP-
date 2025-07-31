//Write a Java Program to define a class with both 
//static and non-static properties and methods. 
//Create object that class and show the invocation of those methods.
public class L5Q2 {
    private int age;
    private static String collegeName = "HSMSS";

    public L5Q2(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static String getCollege() {
        return collegeName;
    }

    public static void main(String[] args) {
        L5Q2 college = new L5Q2(18);
        System.out.println("The age is :" + college.getAge());
        System.out.println("The name is:" + collegeName);
    }

}
