class Calculator
{
    int add(int a, int b)
    {
        return a + b;
    }
    int add(int a, int b, int c)
    {
        return a + b + c;
    }
    double add(double a, double b)
    {
        return a + b;
    }
}
class FunctionOverload
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        System.out.println("Sum of two integers: " + calc.add(70, 20));
        System.out.println("Sum of three integers: " + calc.add(10, 30, 40));
        System.out.println("Sum of two doubles: " + calc.add(40.5, 70.5));
    }
}