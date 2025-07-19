import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the string please:");
        String original = scn.nextLine();
        StringBuilder str = new StringBuilder(original);
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println("The reverse of the string is:" + str);
        scn.close();
    }
}
