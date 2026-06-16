import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < n; i++) {
            boolean duplicate = false;

            for(int j = 0; j < i; j++) {
                if(A[i] == A[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(A[i] + " ");
            }
        }
    }
}