import java.util.Scanner;

public class SillyGame {
    public static void main(String[] args) {
        // madlibs game
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome To The Mysterious Adventure");
        String name, adjective, noun, place, creature, skill, puzzle, title;

        System.out.println(
                "Enter a name(person),adjective(description of a thing),noun(animal or person),place(any place)");
        name = scn.nextLine();
        adjective = scn.nextLine();
        noun = scn.nextLine();
        place = scn.nextLine();

        System.out.printf("Enter a creature(name),puzzle(any type of puzzle)");
        creature = scn.nextLine();
        puzzle = scn.nextLine();

        System.out.println("Enter skill(to unlock sth)");
        skill = scn.nextLine();

        System.out.println("title(as a person)");
        title = scn.nextLine();

        System.out.println(name + " found a " + adjective + " " + noun + " in the " + place + " one day");
        System.out.println("A " + creature + " appeared and challenged them with a " + puzzle + " to solve");
        System.out.println("Using their " + skill + ", they unlocked the legendary " + noun + " hidden inside.");
        System.out.println("From that moment, " + name + " was known as the " + title + " of the land");
        scn.close();

    }
}
