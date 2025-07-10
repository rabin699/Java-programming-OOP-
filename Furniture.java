public class Furniture {
    private String name;
    private double cost;

    public Furniture(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public void display() {
        System.out.println("Name=" + name + "\nCost=" + cost);
    }
}