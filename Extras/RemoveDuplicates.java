import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicateCharacters(input);

        System.out.println("Modified string without duplicates: " + result);
        scanner.close();
    }

    public static String removeDuplicateCharacters(String str) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) { // Only add if not already in set
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

