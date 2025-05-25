//Write a program to take numbers from command line and add all of them. 
public class Command_line_Input {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("The sum is " + sum);
    }
}
