import java.util.*;
public class ch_arr {
    public static char[] ch_str(String s){
        char[] array = new char[s.length()];
        for (int i = 0; i <= s.length()-1; i++){
            array[i] = s.charAt(i);
        }
        return array;
    }
    public static boolean compare(char[] array1, char[] array2){
        if (array1.length != array2.length){
            return false;
        }
        for (int i = 0; i <= (array1.length - 1); i++){
            if (array2[i] != array1[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter txt: ");
        String s = sc.next();

        char[] array2 = s.toCharArray();
        char[] userdef = ch_str(s);
        boolean res = compare(userdef, array2);
        System.out.println(Arrays.toString(userdef));
        System.out.println(Arrays.toString(array2));
        System.out.println(res);
    }
}
