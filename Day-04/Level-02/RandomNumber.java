import java.util.Random;

public class RandomNumber {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random();

        // Generating random 4-digit numbers and storing in the array
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // 1000 to 9999
        }

        return numbers;
    }

    // Method to calculate average, min, and max values from the array
    public static double[] findAverageMinMax(int[] numbers) {
        double[] result = new double[3];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Calculating sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculating the average
        result[0] = (double) sum / numbers.length;
        result[1] = min;
        result[2] = max;

        return result;
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find the average, min, and max values
        double[] stats = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Random 4-digit numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
    }
}