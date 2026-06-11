package advanceJavaProgramming.Annotations;

public class Main {

    public static void main(String[] args) throws Exception {

        Booking booking = new Booking("", "101");

        BookingValidator.validate(booking);
    }
}