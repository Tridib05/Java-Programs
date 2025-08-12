import java.util.Scanner;
class Disarium
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Disarium number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = String.valueOf(num).length();
        int sum = 0;
        for (int i = count; i >= 1; i--) 
        {
            int digit = temp % 10;
            sum += Math.pow(digit, i);
            temp /= 10;
        }
        if (sum == num)
            System.out.println(num + " is a Disarium number.");
        else
            System.out.println(num + " is NOT a Disarium number.");
        sc.close();
    }
}