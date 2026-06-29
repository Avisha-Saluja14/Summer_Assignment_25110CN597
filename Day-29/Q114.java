import java.util.Scanner;

public class Q114 {

    static Scanner sc = new Scanner(System.in);

    public static void inputArray(int arr[], int n) {
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void displayArray(int arr[], int n) {
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findMaximum(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum Element = " + max);
    }

    public static void findMinimum(int arr[], int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum Element = " + min);
    }

    public static void findSum(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double) sum / n);
    }

    public static void searchElement(int arr[], int n) {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }

    public static void main(String[] args) {

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        inputArray(arr, n);

        int choice;

        do {
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Find Sum & Average");
            System.out.println("5. Search Element");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayArray(arr, n);
                    break;

                case 2:
                    findMaximum(arr, n);
                    break;

                case 3:
                    findMinimum(arr, n);
                    break;

                case 4:
                    findSum(arr, n);
                    break;

                case 5:
                    searchElement(arr, n);
                    break;

                case 6:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}