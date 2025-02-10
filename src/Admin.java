import java.util.ArrayList;

public class Admin {
    private final ArrayList<CoworkingSpace> spaces;

    public Admin(ArrayList<CoworkingSpace> spaces) {
        this.spaces = spaces;
    }


    public void addSpace(CoworkingSpace space) {
        spaces.add(space);
        System.out.println("Coworking space added successfully!");
    }


    public void removeSpace(int id) throws InvalidSpaceException {

        boolean removed = spaces.removeIf(space -> space.getId() == id);

        if (!removed) {
            throw new InvalidSpaceException("Coworking space with ID " + id + "does not exist.");
        }
        System.out.println("Coworking space removed successfully!");
    }

    public void viewReservations(ArrayList<Reservation> reservations) {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }
}
