import java.util.*;
public class substr {
    public static String ch(String text, int start, int end){
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++){
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = sc.next();
        System.out.println("Enter start and end index: ");
        int start = sc.nextInt(), end = sc.nextInt();

        String s1 = ch(text, start, end);
        String s2 = text.substring(start, end);
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both aren't equal");
        }
    }
}
