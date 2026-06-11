package advanceJavaProgramming.exceptionHandling;


import java.util.*;

public class HotelService {

    private ArrayList<Booking> bookings = new ArrayList<>();
    private LinkedList<Guest> waitList = new LinkedList<>();
    private Queue<Guest> bookingQueue = new LinkedList<>();
    private Stack<Booking> undoStack = new Stack<>();
    private Set<String> uniqueGuests = new HashSet<>();
    private Map<String, Integer> inventory = new HashMap<>();

    public HotelService() {
        inventory.put("Standard", 2);
        inventory.put("Deluxe", 1);
    }

    public void addGuestToQueue(Guest guest) {
        bookingQueue.offer(guest);
        uniqueGuests.add(guest.getName());
    }

    public void bookRoom(Guest guest, Room room) {

        int available = inventory.getOrDefault(room.getRoomType(), 0);

        if (available > 0) {

            Booking booking = new Booking(guest, room);

            bookings.add(booking);
            undoStack.push(booking);

            inventory.put(room.getRoomType(), available - 1);

            System.out.println("Booking Confirmed");
            System.out.println(booking);

        } else {

            System.out.println("Room Not Available");
            waitList.add(guest);
        }
    }

    public void undoLastBooking() {

        if (!undoStack.isEmpty()) {

            Booking booking = undoStack.pop();
            bookings.remove(booking);

            System.out.println("Cancelled: " + booking);
        }
    }

    public void showBookings() {

        System.out.println("\nBookings:");

        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public void showWaitList() {

        System.out.println("\nWait List:");

        for (Guest guest : waitList) {
            System.out.println(guest.getName());
        }
    }

    public void showInventory() {
        System.out.println("\nInventory:");
        System.out.println(inventory);
    }

    public void showUniqueGuests() {
        System.out.println("\nUnique Guests:");
        System.out.println(uniqueGuests);
    }
}
