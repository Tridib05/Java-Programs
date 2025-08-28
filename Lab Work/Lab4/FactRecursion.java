import java.util.Scanner;
class FactRecursion
{
    public static long factorial(int n) 
    {
        if (n == 0 || n == 1)  
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for factorial: ");
        int numFactorial = sc.nextInt();
        System.out.println("Factorial of " + numFactorial + " = " + factorial(numFactorial));
        sc.close();
    }
}
