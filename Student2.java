import java.util.*;

public class Student2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter your name:");
        String name = scn.nextLine();
        System.out.print("Enter your email:");
        String email = scn.nextLine();
        System.out.print("Enter your age:");
        int age = scn.nextInt();
        scn.close();
        student.setData(name, email, age);
        System.out.println();
        System.out.println("Students Name is:" + student.getName());
        System.out.println("students email is :" + student.getEmail());
        System.out.println("Student age is :" + student.getAge());
    }
}
