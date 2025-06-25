import java.util.Scanner;

public class Person1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String name, address;
        int age, n;
        System.out.printf("Enter the no of person:");
        n = scn.nextInt();
        scn.nextLine();
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter person %d Name:", i + 1);
            name = scn.nextLine();
            System.out.printf("Enter person %d Age:", i + 1);
            age = scn.nextInt();
            scn.nextLine();
            System.out.printf("Enter person %d Address:", i + 1);
            address = scn.nextLine();
            people[i] = new Person(name, age, address);
        }
        scn.close();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (people[j].name.compareToIgnoreCase(people[j + 1].name) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Details of people in ascending order:");
        for (int i = 0; i < n; i++) {
            people[i].display();
        }
    }
}
