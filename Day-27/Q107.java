import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] id = new int[100];
        String[] name = new String[100];
        double[] basic = new double[100];

        int count = 0;
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basic[count] = sc.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        for (int i = 0; i < count; i++) {

                            double hra = basic[i] * 0.20;
                            double da = basic[i] * 0.10;
                            double pf = basic[i] * 0.05;
                            double gross = basic[i] + hra + da;
                            double net = gross - pf;

                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("ID : " + id[i]);
                            System.out.println("Name : " + name[i]);
                            System.out.println("Basic Salary : " + basic[i]);
                            System.out.println("HRA : " + hra);
                            System.out.println("DA : " + da);
                            System.out.println("PF : " + pf);
                            System.out.println("Gross Salary : " + gross);
                            System.out.println("Net Salary : " + net);
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}
