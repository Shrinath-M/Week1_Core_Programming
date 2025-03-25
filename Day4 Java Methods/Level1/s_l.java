import java.util.*;
public class s_l {
    public static int[] smallest_largest(int n1, int n2, int n3){
        int s = n1;
        int l= n2;
        if (n2 > l){
            l = n2;
        }
        if (n3 > l ){
            l = n2;
        }
        if (n2 < s){
            s = n2;
        }
        if (n3 < s){
            s = n3;
        }
        return new int[] {s, l};


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int res[] = smallest_largest(n1, n2, n3);
        System.out.println("Smallest: "+res[0]);
        System.out.println("Largest: "+res[1]);
    }
}
