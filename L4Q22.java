import java.util.Scanner;

public class L4Q22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = scn.nextInt();
        scn.nextLine(); // consume newline
        L4Q2[] students = new L4Q2[n];
        for (int i = 0; i < n; i++) {
            students[i] = new L4Q2();
            students[i].inputData();
        }
        for (L4Q2 s : students) {
            s.display();
        }
        scn.close();
    }
}
