public class Car extends Vehicle {
    public void service() {
        super.service();
        System.out.println("car is serviced...");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.service();
    }
}
