import java.util.Scanner;
class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        long factorial = 1;  
        for (int i = 1; i <= n; i++) 
        {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        sc.close();
    }
}