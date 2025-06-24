/*
 
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
public class Pattern11 {
    public static void main(String args[]) {
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
