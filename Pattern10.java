/*
         * * * * * 
      * * * * *
    * * * * *
  * * * * *
* * * * *
 */
public class Pattern10 {
    public static void main(String args[]) {
        int i, j, k, n = 5;
        for (i = 1; i <= n; i++) {
            for (k = n; k > i; k--) {
                System.out.print("  ");
            }
            for (j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
