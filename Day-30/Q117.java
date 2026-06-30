import java.util.Scanner;

public class Q117 {

    static int[] roll = new int[100];
    static String[] name = new String[100];
    static double[] marks = new double[100];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextDouble();

        count++;
        System.out.println("Student Added Successfully.");
    }

    static void displayStudents() {

        if (count == 0) {
            System.out.println("No Records Found.");
            return;
        }

        System.out.println("\nRoll\tName\tMarks");

        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
        }
    }

    static void searchStudent() {

        System.out.print("Enter Roll No to Search: ");
        int r = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (roll[i] == r) {
                System.out.println("Student Found");
                System.out.println("Name : " + name[i]);
                System.out.println("Marks : " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Record Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n----- Student Record System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}