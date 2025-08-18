class Calculator{
    public int add(int num1,int num2){
        return num1 + num2;
    }
}


public class Class_Demo {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(number1,number2);

        System.out.println(result);
    }
}
