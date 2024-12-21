import java.util.ArrayList;

public class Customer {

    private final ArrayList<Reservation> reservations;

    public Customer(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void browsSpaces(ArrayList<CoworkingSpace> spaces) {
        for (CoworkingSpace space : spaces) {
            System.out.println(space);
        }
    }

    public void makeReservation(int reservationId, int spaceId, String customerName, String date, String startTime, String endTime, ArrayList<CoworkingSpace> spaces) {
        for (CoworkingSpace space : spaces) {
            if (space.getId() == spaceId && space.isAvailable()) {
                reservations.add(new Reservation(reservationId, spaceId, customerName, date, startTime, endTime));
                space.setAvailable(false);
                System.out.println("Reservation made successfully!");
                return;
            }
        }

        System.out.println("Selected space is not available.");
    }

    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    public void cancelReservation(int reservationId, ArrayList<CoworkingSpace> spaces) {
        reservations.removeIf(reservation ->  {
            if (reservation.getReservationId() == reservationId) {
                for (CoworkingSpace space : spaces) {
                    if (space.getId() == reservation.getSpaceId()) {
                        space.setAvailable(true);
                        break;
                    }
                }

                return true;
            }
            return false;
        });

        System.out.println("Reservation cancelled successfully!");
    }
}
