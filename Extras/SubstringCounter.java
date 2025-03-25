import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        int count = countOccurrences(inputString, substring);

        System.out.println("The substring \"" + substring + "\" appears " + count + " times in the given string.");

        scanner.close();
    }

    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }
}

