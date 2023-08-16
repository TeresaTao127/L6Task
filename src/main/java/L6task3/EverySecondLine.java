package L6task3;

import L6task2.FileUtils;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class EverySecondLine {
    public static void main(String[] args) {
        String filePath1 = "src\\main\\resources\\EverySecondLine.txt";
        String filePath2 = "src\\main\\resources\\EverySecondLine1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath1))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber % 2 == 0) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("problem with reading a file!! ");
        }
    }
}


