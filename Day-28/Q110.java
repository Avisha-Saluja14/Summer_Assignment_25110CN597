import java.util.Scanner;

public class Q110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] accNo = new int[100];
        String[] name = new String[100];
        double[] balance = new double[100];

        int count = 0;
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== Bank Account Management =====");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == accNo.length) {
                        System.out.println("Cannot create more accounts.");
                        break;
                    }

                    System.out.print("Enter Account Number: ");
                    int acc = sc.nextInt();
                    sc.nextLine();

                    boolean duplicate = false;

                    for (int i = 0; i < count; i++) {
                        if (accNo[i] == acc) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Account Number already exists.");
                        break;
                    }

                    accNo[count] = acc;

                    System.out.print("Enter Account Holder Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance[count] = sc.nextDouble();

                    count++;

                    System.out.println("Account Created Successfully.");
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("No accounts found.");
                    } else {

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nAccount No : " + accNo[i]);
                            System.out.println("Name       : " + name[i]);
                            System.out.println("Balance    : " + balance[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (accNo[i] == acc) {

                            found = true;

                            System.out.print("Enter Deposit Amount: ");
                            double amount = sc.nextDouble();

                            balance[i] += amount;

                            System.out.println("Amount Deposited Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found.");

                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    acc = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (accNo[i] == acc) {

                            found = true;

                            System.out.print("Enter Withdraw Amount: ");
                            double amount = sc.nextDouble();

                            if (amount <= balance[i]) {
                                balance[i] -= amount;
                                System.out.println("Withdrawal Successful.");
                            } else {
                                System.out.println("Insufficient Balance.");
                            }

                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found.");

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