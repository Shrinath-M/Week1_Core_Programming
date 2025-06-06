import java.util.*;
public class Calendar_display {
    public static String getMonthName(int month){
        String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysinMonth(int month, int year){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)){
            return 29;
        }
        return days[month - 1];
    }
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static void display_Calendar(int month, int year){
        String month_name = getMonthName(month);
        int days_in_month = getDaysinMonth(month, year);
        int first_day = getFirstDayOfMonth(month, year);
        System.out.println("\n" + month_name + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu fri Sat");
        for (int i = 0; i < first_day; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days_in_month; day++) {
            System.out.printf("%3d ", day);
            if ((day + first_day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month (1 - 12): ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        sc.close();
        display_Calendar(month,year);
    }
}
