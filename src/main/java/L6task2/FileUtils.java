package L6task2;

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
}
