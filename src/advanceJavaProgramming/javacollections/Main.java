package advanceJavaProgramming.javacollections;

public class Main {

    public static void main(String[] args) {

        HotelService hotel = new HotelService();

        Guest guest = new Guest("Gaurav");
        Room room = new Room(101, "Deluxe");

        try {

            hotel.bookRoom(guest, room);

            hotel.bookRoom(
                    new Guest("Rahul"),
                    new Room(102, "Deluxe")
            );

        } catch (NoRoomAvailableException e) {

            System.out.println(
                    "Booking Failed: " + e.getMessage()
            );

        } finally {

            System.out.println(
                    "Booking Process Completed"
            );
        }
    }
}