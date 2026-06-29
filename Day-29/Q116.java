import java.util.Scanner;

public class Q116{

    static Scanner sc = new Scanner(System.in);

    public static void addItems(int[] id, String[] name, int[] qty, double[] price, int n) {

        for (int i = 0; i < n; i++) {

            System.out.println("\nItem " + (i + 1));

            System.out.print("Enter Item ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Item Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Quantity: ");
            qty[i] = sc.nextInt();

            System.out.print("Enter Price: ");
            price[i] = sc.nextDouble();
        }
    }

    public static void displayItems(int[] id, String[] name, int[] qty, double[] price, int n) {

        System.out.println("\n---------------- INVENTORY ----------------");
        System.out.printf("%-8s %-15s %-10s %-10s%n", "ID", "Name", "Qty", "Price");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-8d %-15s %-10d %-10.2f%n",
                    id[i], name[i], qty[i], price[i]);
        }
    }

    public static void searchItem(int[] id, String[] name, int[] qty, double[] price, int n) {

        System.out.print("Enter Item ID to Search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (id[i] == search) {

                System.out.println("\nItem Found");
                System.out.println("ID : " + id[i]);
                System.out.println("Name : " + name[i]);
                System.out.println("Quantity : " + qty[i]);
                System.out.println("Price : " + price[i]);

                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Item Not Found.");
    }

    public static void totalValue(int[] qty, double[] price, int n) {

        double total = 0;

        for (int i = 0; i < n; i++) {
            total += qty[i] * price[i];
        }

        System.out.println("Total Inventory Value = " + total);
    }

    public static void main(String[] args) {

        System.out.print("Enter Number of Items: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] name = new String[n];
        int[] qty = new int[n];
        double[] price = new double[n];

        addItems(id, name, qty, price, n);

        int choice;

        do {

            System.out.println("\n========== INVENTORY MENU ==========");
            System.out.println("1. Display Inventory");
            System.out.println("2. Search Item");
            System.out.println("3. Total Inventory Value");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayItems(id, name, qty, price, n);
                    break;

                case 2:
                    searchItem(id, name, qty, price, n);
                    break;

                case 3:
                    totalValue(qty, price, n);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}