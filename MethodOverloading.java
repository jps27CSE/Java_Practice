class CalculatorDemo{
    public int add (int a, int b)
    {
        return a + b;
    }

    public int add(int a, int b, int c)
    {
        return a + b + c;
    }

    public double add(double a, int b)
    {
        return a + b;
    }
}

public class MethodOverloading {
  public static void main(String[] args)
  {
      CalculatorDemo calc = new CalculatorDemo();

      System.out.print(calc.add(10,20));
      System.out.print(calc.add(10,20,30));
      System.out.print(calc.add(10.5,20));
  }
}
