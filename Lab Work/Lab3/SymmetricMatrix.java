import java.util.Scanner;
class SymmetricMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.print("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print("\nElement at (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        boolean isSymmetric = true;
        for (int i = 0; i < n && isSymmetric; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (matrix[i][j] != matrix[j][i]) 
                {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric) 
        {
            System.out.println("\nThe matrix is symmetric.");
        } 
        else 
        {
            System.out.println("\nThe matrix is NOT symmetric.");
        }
        sc.close();
    }
}