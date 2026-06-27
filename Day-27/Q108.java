import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        String[] subjects = new String[6];
        int[] marks = new int[6];

        int total = 0;

        // Input subjects and marks
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Subject " + (i + 1) + " Name: ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter Marks in " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];
        }

        double percentage = total / 6.0;

        // Display Marksheet
        System.out.println("\n------ MARKSHEET ------");
        System.out.println("Roll Number : " + roll);
        System.out.println("Student Name: " + name);

        System.out.println("\nSubjects and Marks:");
        for (int i = 0; i < 6; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }

        System.out.println("\nTotal Marks : " + total);
        System.out.println("Percentage  : " + percentage + "%");

        if (percentage >= 90)
            System.out.println("Grade : A+");
        else if (percentage >= 75)
            System.out.println("Grade : A");
        else if (percentage >= 60)
            System.out.println("Grade : B");
        else if (percentage >= 40)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");

        sc.close();
    }
}