import java.util.*;
public class SpringSeason {
    public static String spr(int m, int d){
        if (m >= 3 || m <= 6){
            return ("Spring Season");
        } else if ( d <= 20) {
            return ("Spring season");
        } else if (d > 20) {
            return ("Not a spring season");
        }else{
            return ("Invalid input");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month: ");
        int m = sc.nextInt();

        System.out.println("Enter date: ");
        int d = sc.nextInt();

        String season = spr(m, d);
        System.out.println(season);
    }
}
