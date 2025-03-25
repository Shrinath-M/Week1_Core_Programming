import javax.swing.text.AttributeSet;
import java.util.*;
public class compare {
    public static boolean isequal(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i <= (s1.length() - 1); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s1 and s2: ");
        String s1 = sc.next(), s2 = sc.next();

        boolean cmpeq = s1.equals(s2);
        boolean eq = isequal(s1, s2);
        if (cmpeq == eq){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both aren't equal");
        }
    }
}
