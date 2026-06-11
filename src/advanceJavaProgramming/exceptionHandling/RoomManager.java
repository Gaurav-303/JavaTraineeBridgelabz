package advanceJavaProgramming.exceptionHandling;

public class RoomManager<T extends Room> {

    private T room;

    public RoomManager(T room) {
        this.room = room;
    }

    public void displayRoom() {
        System.out.println(room);
    }
}
