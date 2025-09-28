class Human_Two {
    private int age;
    private String name;

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


public class This_in_Java {

    public static void main(String[] args) {
        Human_Two obj = new Human_Two();

        obj.setAge(20);
        obj.setName("xiaomi");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }


}
