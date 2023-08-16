package L6task1;

public class Text {
    public static void main(String[] args) {

        String content1 = "Course\n" +
                "Java\n" +
                "Lesson 6\n" +
                "Files\n" +
                "Exceptions\n" +
                "Files\n" +
                "End of file";

        FileUtils.writeToFile("src\\main\\resources\\Data.txt", content1);

        FileUtils.writeToFile("src\\main\\resources\\writeFile_copy.txt", "problem with saving a file!!");

    }
}
