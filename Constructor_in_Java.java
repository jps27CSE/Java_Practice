class Constructor_Class {
    private int age;
    private String name;

    public Constructor_Class() {
        age = 2;
        name = "jack";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor_in_Java {
    public static void main(String[] args) {
        Constructor_Class obj = new Constructor_Class();
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        obj.setAge(10);
        obj.setName("prtiom");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
