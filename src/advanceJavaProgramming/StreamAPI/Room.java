package advanceJavaProgramming.StreamAPI;

public class Room {
    private int roomNumber;
    private double price;

    public Room(int roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return roomNumber + " - " + price;
    }
}