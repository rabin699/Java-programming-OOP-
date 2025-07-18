//Write a program to create a class with properties and 
//methods both with private and public access modifiers.
// Create an instance and show the access of public property and methods
public class L4Q1 {
    // public property
    public String publicName = "Public Name";
    // private property
    private int privateNumber = 42;

    // public method
    public void showPublic() {
        System.out.println("This is a public method.");
    }

    // private method
    private void showPrivate() {
        System.out.println("This is a private method.");
    }

    // Getter for privateNumber
    public int getPrivateNumber() {
        return privateNumber;
    }

    // Method to call the private method showPrivate
    public void callShowPrivate() {
        showPrivate();
    }
}
