import java.util.Scanner;
class GCDRecursion 
{
    public static int gcd(int a, int b) 
    {
        if (b == 0)  // base case
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number for GCD: ");
        int a = sc.nextInt();
        System.out.print("Enter second number for GCD: ");
        int b = sc.nextInt();
        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));
        sc.close();
    }
}
