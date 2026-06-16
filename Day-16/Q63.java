import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the sum: ");
        int sum = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(A[i] + A[j] == sum) {
                    System.out.println("Pair found: " + A[i] + " and " + A[j]);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pair found.");
        }
    }
}