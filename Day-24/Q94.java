import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() == 0) {
            System.out.println("Empty String");
            return;
        }

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed = compressed + str.charAt(i) + count;
                count = 1;
            }
        }

        compressed = compressed + str.charAt(str.length() - 1) + count;

        System.out.println("Compressed String: " + compressed);
    }
}