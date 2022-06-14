package info.sjd.service;

import info.sjd.model.SessionItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

    public static final String FILE_DIR_PATH =
            System.getProperty("user.dir") +
                    System.getProperty("file.separator") +
                    "files" +
                    System.getProperty("file.separator");

    public static void writeBytesToFile(Byte[] bytes, String fileName) {

    }

    public static void writeTextToFile(String text, Boolean append, String fileName) {
        try (FileWriter fileWriter = new FileWriter(FILE_DIR_PATH + fileName, append)) {
            fileWriter.write(text + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Byte[] readBytesFromFile(String fileName) {
        Byte[] bytes = new Byte[0];

        return bytes;
    }

    public static List<SessionItem> readSessinsFromFile(String fileName) {
        List<SessionItem> sessions = new ArrayList<>();
        try (
                FileReader fileReader = new FileReader(FILE_DIR_PATH + fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ){
            String line;
            while ((line = bufferedReader.readLine()) !=null) {
                String[] parts = line.split(" ");
                SessionItem sessionItem = new SessionItem(
                        Long.parseLong(parts[0]),
                        Integer.parseInt(parts[1]),
                        parts[2]
                );
                sessions.add(sessionItem);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sessions;
    }

}
