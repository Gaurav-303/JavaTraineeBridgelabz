package advanceJavaProgramming.javacollections;

import java.io.*;

public class FileManager {

    public void saveBooking(String data) {

        FileWriter writer = null;

        try {

            writer = new FileWriter("booking.txt");
            writer.write(data);

        } catch (IOException e) {

            System.out.println("File Error: " + e.getMessage());

        } finally {

            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}