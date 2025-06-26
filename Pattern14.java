public class Pattern14 {
    public static void main(String args[]) {
        int n = 5, value = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1)
                    value = 1;
                else
                    value = value * (i - j + 1) / (j - 1);
                System.out.printf("%2d", value);
            }
            System.out.println();
        }
    }
}
