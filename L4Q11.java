public class L4Q11 {
    public static void main(String... args) {
        L4Q1 obj = new L4Q1(); // create instance

        // Access public property and method
        System.out.println(obj.publicName);
        obj.showPublic();

        // Access private property and method
        System.out.println(obj.getPrivateNumber());
        obj.callShowPrivate();
    }
}
