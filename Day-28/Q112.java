import java.util.Scanner;

public class Q112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[100];
        String[] phone = new String[100];

        int count = 0;
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count == name.length) {
                        System.out.println("Contact List Full.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String contactName = sc.nextLine();

                    boolean duplicate = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(contactName)) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (duplicate) {
                        System.out.println("Contact Already Exists.");
                        break;
                    }

                    name[count] = contactName;

                    System.out.print("Enter Phone Number: ");
                    phone[count] = sc.nextLine();

                    count++;

                    System.out.println("Contact Added Successfully.");
                    break;

                case 2:

                    if (count == 0)
                        System.out.println("No Contacts Found.");
                    else {

                        for (int i = 0; i < count; i++) {
                            System.out.println("\nName : " + name[i]);
                            System.out.println("Phone : " + phone[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (name[i].equalsIgnoreCase(search)) {

                            System.out.println("Name : " + name[i]);
                            System.out.println("Phone : " + phone[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Name to Delete: ");
                    String delete = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (name[i].equalsIgnoreCase(delete)) {

                            for (int j = i; j < count - 1; j++) {
                                name[j] = name[j + 1];
                                phone[j] = phone[j + 1];
                            }

                            count--;

                            found = true;

                            System.out.println("Contact Deleted Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");

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