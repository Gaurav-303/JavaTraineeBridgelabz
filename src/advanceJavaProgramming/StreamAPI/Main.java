package advanceJavaProgramming.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();

        rooms.add(new Room(103, 3000));
        rooms.add(new Room(101, 1500));
        rooms.add(new Room(102, 2000));

        RoomSorter.sortByPrice(rooms);

        rooms.forEach(System.out::println);
    }
}