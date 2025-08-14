import java.util.Scanner;
class MatrixSubtraction 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sub = new int[rows][cols];
        System.out.print("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) 
            {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Sub of Matrix A and B:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
