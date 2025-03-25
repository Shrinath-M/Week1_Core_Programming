import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        char mostFrequentChar = '\0';
        int maxCount = 0;

        for (char ch : input.toCharArray()) {
            if (!Character.isWhitespace(ch)) { // Ignore spaces
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
                if (frequencyMap.get(ch) > maxCount) {
                    maxCount = frequencyMap.get(ch);
                    mostFrequentChar = ch;
                }
            }
        }

        if (mostFrequentChar != '\0') {
            System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
        } else {
            System.out.println("No characters found in the input.");
        }
    }
}
