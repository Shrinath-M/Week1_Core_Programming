import java.util.*;
public class choco {
    public static int[] no_of_choco_child(int n, int c){
        int rem =  n % c;
        int cnt =  n / c;
        return new int[] {cnt, rem};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of chocolats: ");
        int n = sc.nextInt();
        System.out.println("Enter no of children: ");
        int c = sc.nextInt();
        int res[] = no_of_choco_child(n, c);
        System.out.println("No of chocolates each child gets: "+res[0]);
        System.out.println("Remaining chocolates: "+res[1]);
    }
}
