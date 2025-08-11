import java.util.Scanner;
class MinOfTwo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        if (a < b) 
        {
            System.out.println("The minimum number is: " + a);
        } 
        else if (b < a) 
        {
            System.out.println("The minimum number is: " + b);
        } 
        else 
        {
            System.out.println("Both numbers are equal.");
        }
        sc.close();
    }
}