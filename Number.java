public class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isEven() {
        if (number % 2 == 0)
            return true;
        return false;
    }

    public boolean isFibo() {
        int a = 0, b = 1, temp = 0;
        while (a <= number) {
            if (temp == number) {
                return true;
            }
            temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}