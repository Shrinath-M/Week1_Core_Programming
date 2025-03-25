import java.util.*;
public class length {
    public static int length_of_string(String s){
        int c = 0;
        while(true){
            if (c >= s.lastIndexOf("")){
                break;
            }
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();
        int len_str = length_of_string(s);
        System.out.println(len_str);
    }
}