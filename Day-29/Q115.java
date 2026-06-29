import java.util.Scanner;

public class Q115 {

    static Scanner sc = new Scanner(System.in);

    public static void displayLength(String str) {
        System.out.println("Length = " + str.length());
    }

    public static void convertUpper(String str) {
        System.out.println("Uppercase = " + str.toUpperCase());
    }

    public static void convertLower(String str) {
        System.out.println("Lowercase = " + str.toLowerCase());
    }

    public static void reverseString(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed String = " + rev);
    }

    public static void checkPalindrome(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");
    }

    public static void countVowels(String str) {

        int count = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }

        System.out.println("Total Vowels = " + count);
    }

    public static void main(String[] args) {

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int choice;

        do {

            System.out.println("\n===== STRING OPERATIONS =====");
            System.out.println("1. Display Length");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Convert to Lowercase");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Count Vowels");
            System.out.println("7. Enter New String");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    displayLength(str);
                    break;

                case 2:
                    convertUpper(str);
                    break;

                case 3:
                    convertLower(str);
                    break;

                case 4:
                    reverseString(str);
                    break;

                case 5:
                    checkPalindrome(str);
                    break;

                case 6:
                    countVowels(str);
                    break;

                case 7:
                    System.out.print("Enter New String: ");
                    str = sc.nextLine();
                    break;

                case 8:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
