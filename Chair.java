public class Chair extends Furniture {
    private int mfdDate;

    public Chair(String name, double cost, int mfdDate) {
        super(name, cost); // use of super class for envoking constructor of super class
        this.mfdDate = mfdDate;
    }

    public void display() {// method overriding
        super.display();
        System.out.println("The manufacture date is :" + mfdDate);
    }

    public static void main(String args[]) {
        Chair c = new Chair("Chair", 190323.2222, 2023);
        c.display();
    }
}
