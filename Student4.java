import java.util.*;

public class Student4 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter your name sir:");
        name = scn.nextLine();
        System.out.println("Enter your age sir:");
        age = scn.nextInt();
        scn.nextLine();

        Student3 s1 = new Student3(name, age);

        System.out.println("Enter your name sir:");
        name = scn.nextLine();
        System.out.println("Enter your age sir:");
        age = scn.nextInt();
        scn.nextLine();
        Student3 s2 = new Student3(name, age);

        System.out.println();
        scn.close();
        s1.display();
        s2.display();
        Student3.StdNo();
    }
}
