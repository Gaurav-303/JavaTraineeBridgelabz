package advanceJavaProgramming.exceptionHandling;

public class Main {

    public static void main(String[] args) {

        HotelService hotel = new HotelService();

        Guest g1 = new Guest("Gaurav");
        Guest g2 = new Guest("Rahul");
        Guest g3 = new Guest("Aman");

        Room r1 = new Room(101, "Standard");
        Room r2 = new Room(102, "Deluxe");

        RoomManager<Room> manager = new RoomManager<>(r1);
        manager.displayRoom();

        hotel.addGuestToQueue(g1);
        hotel.addGuestToQueue(g2);
        hotel.addGuestToQueue(g3);

        hotel.bookRoom(g1, r1);
        hotel.bookRoom(g2, r2);
        hotel.bookRoom(g3, r2);

        hotel.showBookings();
        hotel.showWaitList();
        hotel.showInventory();
        hotel.showUniqueGuests();

        hotel.undoLastBooking();

        hotel.showBookings();
    }
}
