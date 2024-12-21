import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CoworkingSpace> spaces = new ArrayList<>();
        ArrayList<Reservation> reservations = new ArrayList<>();

        Admin admin = new Admin(spaces);
        Customer customer = new Customer(reservations);

        Scanner scanner = new Scanner(System.in);
        int choice;


        do {
            System.out.println("\n--- Welcome to Azamat's Coworking space ---");
            System.out.println("\n--------------Main Menu--------------------");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n---Admin Menu---");
                    System.out.println("1. Add a new coworking space");
                    System.out.println("2. Remove a coworking space");
                    System.out.println("3. View all reservations");
                    int adminChoice = scanner.nextInt();

                    switch (adminChoice) {
                        case 1:
                            System.out.print("Enter space ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter space type: ");
                            String type = scanner.nextLine();
                            System.out.print("Enter price: ");
                            double price = scanner. nextDouble();
                            System.out.print("Is available (true/false): ");
                            boolean isAvailable = scanner.nextBoolean();
                            admin.addSpace(new CoworkingSpace(id, type, price, isAvailable));
                            break;
                        case 2:
                            System.out.print("Enter space ID to remove: ");
                            int removeId = scanner.nextInt();
                            admin.removeSpace(removeId);
                            break;

                        case 3:
                            admin.viewReservations(reservations);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("/n---Customer Menu---");
                    System.out.println("1. Browse available spaces");
                    System.out.println("2. Make a reservation");
                    System.out.println("3. View my reservations");
                    System.out.println("4. Cancel a reservation");
                    System.out.print("Enter your choice: ");
                    int customerChoice = scanner.nextInt();

                    switch (customerChoice) {
                        case 1:
                            customer.browsSpaces(spaces);
                            break;
                        case 2:
                            System.out.print("Enter reservation ID: ");
                            int reservationId = scanner.nextInt();
                            System.out.print("Enter space ID: ");
                            int spaceId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter your name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter date (YYYY-MM-DD): ");
                            String date = scanner.nextLine();
                            System.out.print("Enter start time (HH:MM): ");
                            String startTime = scanner.nextLine();
                            System.out.print("Enter end time (HH:MM): ");
                            String endTime = scanner.nextLine();
                            customer.makeReservation(reservationId, spaceId, name, date, startTime, endTime, spaces);
                            break;
                        case 3:
                            customer.viewReservations();
                            break;
                        case 4:
                            System.out.print("Enter reservation ID to cancel: ");
                            int cancelId = scanner.nextInt();
                            customer.cancelReservation(cancelId, spaces);
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please, try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

}
