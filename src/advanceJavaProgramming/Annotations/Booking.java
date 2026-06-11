package advanceJavaProgramming.Annotations;

public class Booking {

    @BookingValidation(message = "Guest name is mandatory")
    private String guestName;

    @BookingValidation(message = "Room number is mandatory")
    private String roomNumber;

    public Booking(String guestName, String roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }
}
