package advanceJavaProgramming.javacollections;

import java.util.*;

public class HotelService {

    private ArrayList<Booking> bookings = new ArrayList<>();
    private Map<String, Integer> inventory = new HashMap<>();

    public HotelService() {
        inventory.put("Deluxe", 1);
    }

    public void bookRoom(Guest guest, Room room)
            throws NoRoomAvailableException {

        int available = inventory.getOrDefault(room.getRoomType(), 0);

        if (available <= 0) {
            throw new NoRoomAvailableException(
                    room.getRoomType() + " room is not available");
        }

        Booking booking = new Booking(guest, room);
        bookings.add(booking);

        inventory.put(room.getRoomType(), available - 1);

        System.out.println("Booking Confirmed");
    }
}