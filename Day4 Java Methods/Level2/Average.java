import java.util.*;

public class Average {


    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return randomNumbers;
    }
    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / (double) numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        Scanner randomValues = new Scanner(System.in);
        int size = 5; // Number of random values
        int[] numbers = randomValues.generate4DigitRandomArray(size);

        System.out.println("Random 4-digit numbers: " + Arrays.toString(numbers));
        double[] results = randomValues.findAverageMinMax(numbers);
        System.out.println("Average value: " + results[0]);
        System.out.println("Minimum value: " + results[1]);
        System.out.println("Maximum value: " + results[2]);
    }
}

