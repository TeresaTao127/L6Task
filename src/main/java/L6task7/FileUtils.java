package L6task7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    public static String readFromFile(String filePath1) {
        String content1=null;
        try {
            content1 = Files.readString(Path.of(filePath1));


        } catch (IOException e) {
            System.out.println("problem with reading a file!! "  );

        }
        return content1;
    }

    public static void writeToFile(String pathToFile, String text) {
        try {
            Files.writeString(Path.of(pathToFile), text);

        } catch (IOException exception) {
            System.out.println("problem with saving a file!! " + exception.getMessage());

        }
    }
}
