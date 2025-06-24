
class Student {
    private String name;
    private String email;
    private int age;

    public void setData(String n, String e, int a) {
        name = n;
        email = e;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

}