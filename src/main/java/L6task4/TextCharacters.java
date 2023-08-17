package L6task4;

import L6task2.FileUtils;

public class TextCharacters {
    public static void main(String[] args) {
        String filePath1="src\\main\\resources\\TextCharacters.txt";

        String content1= FileUtils.readFromFile(filePath1);
        System.out.println(content1.length());
    }
}
