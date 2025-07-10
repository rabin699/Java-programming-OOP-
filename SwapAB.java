public class SwapAB {
    private int a;
    private int b;

    public SwapAB(int num1, int num2) {
        a = num1;
        b = num2;
    }

    public void swap() {
        a = a + b;
        b = a - b;
        a = b - a;
    }
}
