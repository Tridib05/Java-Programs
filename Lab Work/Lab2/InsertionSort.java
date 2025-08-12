import java.util.Scanner;
class InsertionSort 
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
        for (int i = 1; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("Sorted array (Insertion Sort):");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
        sc.close();
    }
}