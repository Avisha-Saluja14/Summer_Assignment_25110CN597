import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int A[][] = new int[r][c];

        System.out.println("Enter elements of Matrix A:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Transpose of matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[j][i]+"\t");
            }
            System.out.println();
        }
    }
}