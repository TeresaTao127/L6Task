package L6task2;

public class TextReading {
    public static void main(String[] args) {
        String filePath1="src\\main\\resources\\DataReading.txt";

        String content1= FileUtils.readFromFile(filePath1);
        System.out.println("Content of a file: \n"+content1);
    }
}
