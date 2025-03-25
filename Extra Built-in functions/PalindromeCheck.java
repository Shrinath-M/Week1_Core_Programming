import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        String inputString = getUserInput("Enter a string to check if it's a palindrome: ");

        boolean isPalindrome = checkPalindrome(inputString);

        displayResult(inputString, isPalindrome);
    }
    public static String getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
