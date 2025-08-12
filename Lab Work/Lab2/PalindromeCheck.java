import java.util.Scanner;
class PalindromeCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int reverse = 0;
        while (number != 0) 
        {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        if (originalNumber == reverse) 
        {
            System.out.println(originalNumber + " is a Palindrome number.");
        } 
        else 
        {
            System.out.println(originalNumber + " is NOT a Palindrome number.");
        }
        sc.close();
    }
}
