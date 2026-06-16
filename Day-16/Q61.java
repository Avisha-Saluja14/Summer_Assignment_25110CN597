import java.util.Scanner;

public class Q61
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " array elements:");

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arrSum += arr[i];
        }

        int totalSum = n * (n + 1) / 2;
        int missing = totalSum - arrSum;

        System.out.println("Missing Number = " + missing);
    }
}
