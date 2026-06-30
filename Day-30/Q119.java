import java.util.Scanner;

public class Q119 {

    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static String[] department = new String[100];
    static double[] salary = new double[100];

    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // Add Employee
    static void addEmployee() {

        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department: ");
        department[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee Added Successfully.");
    }

    // Display Employees
    static void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\nID\tName\tDepartment\tSalary");

        for (int i = 0; i < count; i++) {
            System.out.println(empId[i] + "\t" + empName[i] + "\t" + department[i] + "\t\t" + salary[i]);
        }
    }

    // Search Employee
    static void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.println("\nEmployee Found");
                System.out.println("ID : " + empId[i]);
                System.out.println("Name : " + empName[i]);
                System.out.println("Department : " + department[i]);
                System.out.println("Salary : " + salary[i]);
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Update Salary
    static void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {

            if (empId[i] == id) {

                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();

                System.out.println("Salary Updated Successfully.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Mini Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    updateSalary();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);
    }
}