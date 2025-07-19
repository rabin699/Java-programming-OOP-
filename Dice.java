import java.util.Random;
import java.util.Scanner;

public class Dice {
        public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                Random ran = new Random();
                int roll, num, total = 0;
                System.out.print("How many times you want to roll:");
                num = scn.nextInt();
                scn.close();
                if (num == 0) {
                        System.out.println("The number should be greater than 0 please roll again");
                        return;
                }
                for (int i = 1; i <= num; i++) {
                        roll = ran.nextInt(1, 7);
                        DiceShow(roll);
                        total += roll;
                }
                System.out.println("Total numbers of all dices are:" + total);

        }

        public static void DiceShow(int roll) {
                String dice1 = """
                                -------------
                                |           |
                                |     ●     |
                                |           |
                                -------------
                                """;
                String dice2 = """
                                -------------
                                | ●         |
                                |           |
                                |         ● |
                                -------------
                                """;
                String dice3 = """
                                -------------
                                | ●         |
                                |     ●     |
                                |         ● |
                                -------------
                                """;
                String dice4 = """
                                -------------
                                | ●       ● |
                                |           |
                                | ●       ● |
                                -------------
                                """;
                String dice5 = """
                                -------------
                                | ●       ● |
                                |     ●     |
                                | ●       ● |
                                -------------
                                """;
                String dice6 = """
                                -------------
                                | ●   ●   ● |
                                |           |
                                | ●   ●   ● |
                                -------------
                                """;
                switch (roll) {
                        case 1 -> System.out.println(dice1);
                        case 2 -> System.out.println(dice2);
                        case 3 -> System.out.println(dice3);
                        case 4 -> System.out.println(dice4);
                        case 5 -> System.out.println(dice5);
                        case 6 -> System.out.println(dice6);
                }
        }
}
