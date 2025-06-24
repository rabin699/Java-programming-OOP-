class Student3 {
    private String name;
    private int age;
    private static int total;

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
        total++;
    }

    public void display() {
        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
    }

    public static void StdNo() {
        System.out.println("The no of students are:" + total);
    }
}