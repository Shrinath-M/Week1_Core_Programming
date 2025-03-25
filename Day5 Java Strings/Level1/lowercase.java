import java.util.*;
public class lowercase {
    public static String lower_case(String text){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return (result.toString());
    }
    public static boolean compare(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.next();

        String built_in = text.toLowerCase();
        String user_defined = lower_case(text);
        boolean com_res = compare(built_in, user_defined);

        System.out.println("Uppercase using built-in method: " + built_in);
        System.out.println("Uppercase using custom method: " + user_defined);
        System.out.println("Are both results same? " + com_res);

    }
}
