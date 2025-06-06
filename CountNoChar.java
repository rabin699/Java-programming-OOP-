//Write a program to read a sentence and counts the total number of character (excluding space) using while loop.

import java.util.Scanner;

public class CountNoChar {
    public static void main(String[] args) {
        int i = 0, count = 0;
        String sentence;
        System.out.print("Please write a sentence:");
        Scanner scn = new Scanner(System.in);
        sentence = scn.nextLine();
        while (i < sentence.length()) {
            if (sentence.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
        System.out.println("The total no of character in the given sentence is:" + count);
        scn.close();
    }
}