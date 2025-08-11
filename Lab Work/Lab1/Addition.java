import java.util.Scanner; 

class Addition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int a,b,c;
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        c = a+b;
        System.out.println("The sum is: " + c);
        sc.close();
    }
}
