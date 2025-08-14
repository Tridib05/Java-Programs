import java.util.Scanner;
class MaxInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        System.out.print("Maximum element in the array: " + max);
        sc.close();
    }
}
