public class Reservation {
    private final int reservationId;
    private final int spaceId;
    private final String customerName;
    private final String date;
    private final String startTime;
    private final String endTime;

    public Reservation(int reservationId, int spaceId, String customerName, String date, String startTime, String endTime) {
        this.reservationId = reservationId;
        this.spaceId = spaceId;
        this.customerName = customerName;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getReservationId() {
        return reservationId;
    }

    public int getSpaceId() {
        return spaceId;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + ", Space ID: " + spaceId + ", Customer: " + customerName + ", Date: " + date + ", Time: " + startTime + " - " + endTime;
    }


}
