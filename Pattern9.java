/*
*             * 
* *         * * 
* * *     * * * 
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
 */
public class Pattern9 {
    public static void main(String args[]) {
        int i, j, k, n = 4;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (k = 2 * n; k > 2 * i; k--) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (k = 2 * n; k > 2 * i; k--) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
