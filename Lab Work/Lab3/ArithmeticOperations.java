import java.util.Scanner;
class ArithmeticOperations {
    void add(int a, int b) 
    {
        int c = a + b;
        System.out.println("sum = " + c);
    }
    void sub(int a, int b) 
    {
        int c = a - b;
        System.out.println("sub = " + c);
    }
    void mul(int a, int b) 
    {
        int c = a * b;
        System.out.println("mul = " + c);
    }
    void div(int a, int b) 
    {
        if (b == 0) 
        {
            System.out.println("div = undefined (cannot divide by 0)");
            return;
        }
        int quotient = a / b;      
        int remainder = a % b;    
        double exact = (double) a / b; 
        System.out.println("div (quotient) = " + quotient);
        System.out.println("remainder = " + remainder);
        System.out.println("exact division = " + exact);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArithmeticOperations p1 = new ArithmeticOperations();
        p1.add(a, b);
        p1.sub(a, b);
        p1.mul(a, b);
        p1.div(a, b);
        sc.close();
    }                 
}
