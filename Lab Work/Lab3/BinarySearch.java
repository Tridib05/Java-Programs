import java.util.Scanner;
import java.util.Arrays;
class BinarySearch 
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
        Arrays.sort(arr); 
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) 
            {
                System.out.print("Element found at index (sorted array): " + mid);
                found = true;
                break;
            } 
            else if (arr[mid] < key) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }
        if (!found) 
        {
            System.out.print("Element not found in the array.");
        }
        sc.close();
    }
}
