package L6task8;

public class SquareRoot {

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Input value cannot be negative!!");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        double input = 49;

        try {
            double result = calculateSquareRoot(input);
            System.out.println("Square root of:" + input + " is " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
