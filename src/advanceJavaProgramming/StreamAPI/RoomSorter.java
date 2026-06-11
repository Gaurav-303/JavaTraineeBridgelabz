package advanceJavaProgramming.StreamAPI;

import java.util.Comparator;
import java.util.List;

public class RoomSorter {

    public static void sortByPrice(List<Room> rooms) {
        rooms.sort((r1, r2) ->
                Double.compare(r1.getPrice(), r2.getPrice()));
    }

    public static void sortByRoomNumber(List<Room> rooms) {
        rooms.sort(
                Comparator.comparing(Room::getRoomNumber)
        );
    }
}
