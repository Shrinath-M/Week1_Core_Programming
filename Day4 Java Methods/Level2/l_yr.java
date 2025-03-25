import java.util.*;
public class l_yr {
    public static String leap_year(int n) {
        if (n % 4 == 0 && n % 100 != 0) {
            return "Leap year";
        } else if (n % 400 == 0) {
            return "Not a leap year";
        }
        else{
            return "Invalid year";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = sc.nextInt();
        String l_y = leap_year(n);
        System.out.println(l_y);
    }
}
