class Phone {
    String name;
    int age;

    public void show() {
        System.out.println("Brand Name is: " + name + " age is: " + age);
    }

    public static void show1(Phone obj) {
        System.out.println("Brand Name is: " + obj.name + " age is: " + obj.age);
    }

}


public class Static_Method_in_Java {
    public static void main(String[] args) {
        Phone ob1 = new Phone();
        ob1.name = "Xiaomi";
        ob1.age = 5;

        ob1.show();

        Phone.show1(ob1);
    }
}
