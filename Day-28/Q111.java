import java.util.Scanner;

public class Q111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] seatNo = new int[50];
        String[] passenger = new String[50];

        int count = 0;
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Bookings");
            System.out.println("3. Search Booking");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count == seatNo.length) {
                        System.out.println("All Seats are Booked.");
                        break;
                    }

                    System.out.print("Enter Seat Number: ");
                    int seat = sc.nextInt();
                    sc.nextLine();

                    boolean booked = false;

                    for (int i = 0; i < count; i++) {
                        if (seatNo[i] == seat) {
                            booked = true;
                            break;
                        }
                    }

                    if (booked) {
                        System.out.println("Seat Already Booked.");
                        break;
                    }

                    seatNo[count] = seat;

                    System.out.print("Enter Passenger Name: ");
                    passenger[count] = sc.nextLine();

                    count++;

                    System.out.println("Ticket Booked Successfully.");
                    break;

                case 2:

                    if (count == 0)
                        System.out.println("No Bookings Found.");
                    else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\nSeat No : " + seatNo[i]);
                            System.out.println("Passenger : " + passenger[i]);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Seat Number: ");
                    seat = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (seatNo[i] == seat) {

                            System.out.println("Passenger Name : " + passenger[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Booking Not Found.");

                    break;

                case 4:

                    System.out.print("Enter Seat Number to Cancel: ");
                    seat = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (seatNo[i] == seat) {

                            for (int j = i; j < count - 1; j++) {
                                seatNo[j] = seatNo[j + 1];
                                passenger[j] = passenger[j + 1];
                            }

                            count--;

                            found = true;

                            System.out.println("Ticket Cancelled Successfully.");
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Booking Not Found.");

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