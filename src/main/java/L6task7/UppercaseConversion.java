package L6task7;

import L6task2.FileUtils;

public class UppercaseConversion {
    public static void main(String[] args) {
        String filePath1="src\\main\\resources\\UppercaseConversion.txt";

        String content= FileUtils.readFromFile(filePath1);
        String contentUppercase=content.toUpperCase();
        System.out.println("Content of a file: \n"+contentUppercase);

        L6task7.FileUtils.writeToFile("src\\main\\resources\\UppercaseConversionFinal.txt", contentUppercase);

    }
}
