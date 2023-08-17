package L6task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContentReversing {
    public static void main(String[] args) {
        String filePath1 = "src\\main\\resources\\ContentReversing.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath1))) {
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("problem with reading a file!! ");
        }
    }
}
