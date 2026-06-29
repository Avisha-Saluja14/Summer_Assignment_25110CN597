import java.util.Scanner;

public class Q113{

    static int count = 0;
    static double lastResult = 0;

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return lastResult;
        }
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========== MENU DRIVEN CALCULATOR ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Show Last Result");
            System.out.println("8. Total Calculations");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        lastResult = add(num1, num2);
                        break;

                    case 2:
                        lastResult = subtract(num1, num2);
                        break;

                    case 3:
                        lastResult = multiply(num1, num2);
                        break;

                    case 4:
                        lastResult = divide(num1, num2);
                        break;

                    case 5:
                        lastResult = modulus(num1, num2);
                        break;

                    case 6:
                        lastResult = power(num1, num2);
                        break;
                }

                count++;
                System.out.println("Result = " + lastResult);

            } else if (choice == 7) {

                System.out.println("Last Result = " + lastResult);

            } else if (choice == 8) {

                System.out.println("Total Calculations Performed = " + count);

            } else if (choice == 9) {

                System.out.println("Thank you for using Calculator!");

            } else {

                System.out.println("Invalid Choice!");

            }

        } while (choice != 9);

        sc.close();
    }
}