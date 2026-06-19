import java.util.Scanner;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

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
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                    sum=sum+A[i][j];
            }
        }
        System.out.println("Sum of diagonal elements is "+sum);
    }
}