import java.util.*;

public class vowels {
    public static void main(String[] args) {

        String text = "Shrinath is an intelligent fellow";
        int wordCount = countWords(text);
        List<String> vowelWords = findVowelWords(text);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Words starting with a vowel: " + vowelWords);
    }

    public static int countWords(String text) {
        String[] words = text.split("\\s+"); // Split the string by spaces
        return words.length;
    }

    public static List<String> findVowelWords(String text) {
        List<String> vowelWords = new ArrayList<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            if ("aeiou".indexOf(firstLetter) != -1) { // Check if the first letter is a vowel
                vowelWords.add(word);
            }
        }
        return vowelWords;
    }
}
