import java.util.Scanner;

public class Q118 {

    static int[] bookId = new int[100];
    static String[] bookName = new String[100];
    static String[] author = new String[100];
    static boolean[] issued = new boolean[100];

    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    static void addBook() {

        System.out.print("Enter Book ID: ");
        bookId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName[count] = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author[count] = sc.nextLine();

        issued[count] = false;
        count++;

        System.out.println("Book Added Successfully.");
    }

    static void displayBooks() {

        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }

        System.out.println("\nID\tBook Name\tAuthor\tStatus");

        for (int i = 0; i < count; i++) {
            System.out.println(bookId[i] + "\t" + bookName[i] + "\t" + author[i]
                    + "\t" + (issued[i] ? "Issued" : "Available"));
        }
    }

    static void issueBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                if (!issued[i]) {
                    issued[i] = true;
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void returnBook() {

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (bookId[i] == id) {

                if (issued[i]) {
                    issued[i] = false;
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book Was Not Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    returnBook();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}