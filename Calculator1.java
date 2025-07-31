//
public class Calculator1 {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator1 calcu = new Calculator1();
        int a = calcu.add(2, 5);
        int b = calcu.add(2, 5, 10);
        System.out.println("A=" + a);
        System.out.println("B=" + b);
    }
}
