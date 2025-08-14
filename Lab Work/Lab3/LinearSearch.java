import java.util.Scanner;
class LinearSearch 
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
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == key) 
            {
                System.out.print("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.print("Element not found in the array.");
        }
        sc.close();
    }
}
