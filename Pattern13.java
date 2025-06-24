/*
       * 
    * * *
  * * * * *
* * * * * * *
* * * * * * *
  * * * * *
    * * *
      *
 */
public class Pattern13 {
    public static void main(String[] args) {
        int i, j, k, n = 4;
        for (i = 1; i <= n; i++) {
            for (k = n; k > i; k--) {
                System.out.print("  ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = n; i >= 1; i--) {

            for (k = n; k > i; k--) {
                System.out.print("  ");
            }
            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
