import java.util.Scanner;

public class CountPostiveNegative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Enter nth term:");
        n = scn.nextInt();
        System.out.print("Enter the elements of the array:");
        int[] arr = new int[n];
        arr = userInput(n, scn);
        countNum(arr);
        scn.close();
    }

    public static void countNum(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] == 0) {
                zero++;
            } else {
                negative++;
            }
        }
        System.out.println("The postive numbers are " + positive);
        System.out.println("The Negative numbers are " + negative);
        System.out.println("The Zero numbers are " + zero);
    }

    public static int[] userInput(int n, Scanner scn) {
        int[] local = new int[n];
        for (int i = 0; i < n; i++) {
            local[i] = scn.nextInt();
        }
        return local;
    }
}
