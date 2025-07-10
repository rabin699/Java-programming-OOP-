
import java.util.Scanner;

public class QuizGame {
    public static void main(String... args) {
        String questions[] = { "What is the powerhouse of a cell?",
                "What is the work of a router?",
                "Which part of computer is considered as brain of a computer?",
                "Who is known as father of computer's?",
                "What invented light bulb?" };
        String options[][] = { { "1. Lysosomes ", "2.Golgi Apparatus", "3. Nucleus", "4. Microchondria" },
                { "1. Storing Files", "2. Decrypting Files", "3. Directing Internet traffic ", "4. Encrypting Data" },
                { "1. CPU", "2. Hard Drive", "3. RAM", "4. GPU" },
                { "1. Lady Augusta ada lovelace", "2. Charles Babbage", "3. Charles Darwin", "4. Louis Pasture" },
                { "1. Charles Whales", "2. Thomas Edison", "3. Albert Einstein", "4. Newton" } };
        int[] ans = { 4, 3, 1, 2, 2 };
        int score = 0;
        int guess;
        Scanner scn = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("* Welcome to Java Quiz Game! *");
        System.out.println("******************************");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess please:");
            guess = scn.nextInt();
            if (guess == ans[i]) {
                System.out.println("********");
                System.out.println("Correct");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println("Wrong");
                System.out.println("********");
            }

        }
        scn.close();
        System.out.println("Your final score is :" + score + " out of " + questions.length);

    }
}
