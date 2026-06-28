import java.util.Scanner;

public class Q109 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bookId = new int[100];
        String[] bookName = new String[100];
        boolean[] issued = new boolean[100];

        int count = 0;
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == bookId.length) {
                        System.out.println("Library is full. Cannot add more books.");
                        break;
                    }

                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean duplicate = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == id) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Book ID already exists.");
                        break;
                    }

                    bookId[count] = id;

                    System.out.print("Enter Book Name: ");
                    bookName[count] = sc.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {

                        System.out.println("\n---------- Book Records ----------");

                        for (int i = 0; i < count; i++) {

                            System.out.println("Book ID   : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Status    : " + (issued[i] ? "Issued" : "Available"));
                            System.out.println("----------------------------------");
                        }

                        System.out.println("Total Books : " + count);
                    }

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (bookId[i] == issueId) {

                            found = true;

                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");

                    break;

                case 4:

                    if (count == 0) {
                        System.out.println("No books available.");
                        break;
                    }

                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (bookId[i] == returnId) {

                            found = true;

                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book is already available.");
                            }

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");

                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
