import java.util.Random;
import java.util.Scanner;

public class RockPaperSissors {
    public static void main(String... args) {
        Random ran = new Random();
        Scanner scn = new Scanner(System.in);
        String[] game = { "rock", "paper", "scissors" };
        String userChoice, computerChoice;
        boolean stopper = true;
        System.out.println("Welcome to the Game (Rock,Paper,Scissors)");
        while (stopper) {
            System.out.print("Enter your choice please (rock, paper, scissors): ");
            userChoice = scn.nextLine().toLowerCase();
            int choice = ran.nextInt(3); // 0, 1, or 2
            computerChoice = game[choice];
            System.out.println("Computer's choice is: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("rock") && computerChoice.equalsIgnoreCase("scissors")) ||
                    (userChoice.equalsIgnoreCase("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                    (userChoice.equalsIgnoreCase("scissors") && computerChoice.equalsIgnoreCase("paper"))) {
                System.out.println("You won congratulations!");
            } else {
                System.out.println("You lost buddy, try next time!");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String stop = scn.nextLine();
            if (stop.equalsIgnoreCase("no")) {
                stopper = false;
            }
        }

        scn.close();
    }
}
