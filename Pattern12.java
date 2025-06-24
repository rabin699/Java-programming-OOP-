/*
       1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 */
public class Pattern12 {
    public static void main(String args[]) {
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (k = n; k > i; k--) {
                System.out.print("  ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
