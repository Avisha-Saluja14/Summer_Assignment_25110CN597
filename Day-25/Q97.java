import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        int c[] = new int[n + m];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        while (i < n)
            c[k++] = a[i++];

        while (j < m)
            c[k++] = b[j++];

        System.out.println("Merged Array:");
        for (int x : c)
            System.out.print(x + " ");
    }
}