//Write a program in java to input two numbers and calculate sum, 
//difference, product and quotient. [Create class number with above mentioned methods]
public class L4Q3 {
    private int num1;
    private int num2;

    public L4Q3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum() {
        System.out.println("The sums is:" + (num1 + num2));
    }

    public void difference() {
        System.out.println("The difference is:" + (num1 - num2));
    }

    public void product() {
        System.out.println("The product is:" + (num1 * num2));
    }

    public void quotient() {
        float q = (float) num1 / num2;
        System.out.println("The quotient is:" + q);
    }
}
