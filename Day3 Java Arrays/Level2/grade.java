import java.util.*;
public class grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int p_m[] = new int[size];

        int c_m[] = new int[size];

        int m_m[] = new int[size];

        int perc[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.println("Enter physics mark of student "+(i+1));
            p_m[i] = sc.nextInt();
            System.out.println("Enter chemistry mark of student "+(i+1));
            c_m[i] = sc.nextInt();
            System.out.println("Enter maths mark of student "+(i+1));
            m_m[i] = sc.nextInt();

            perc[i] =  (p_m[i] + c_m[i] +  m_m[i]) / 3;

        }
        System.out.println("Percentage of each student "+Arrays.toString(perc));





    }
}
