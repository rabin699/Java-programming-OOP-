//Write a program demonstrate the abstract class. 
//The program should inherit the abstract class and instantiate it to show the instantiation of abstract class.
public abstract class L5Q4 {
    abstract public void showMessage();

    abstract public void showCollege();
}

class Child extends L5Q4 {
    @Override
    public void showMessage() {
        System.out.println("Hello world! k xa");
    }

    @Override
    public void showCollege() {
        System.out.println("I belong to HSMSS college");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.showCollege();
        obj.showMessage();
    }
}
