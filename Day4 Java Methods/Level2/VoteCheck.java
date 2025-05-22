import java.util.*;
public class VoteCheck {
    public static void can_stu_vote(int age[]){
        for (int i = 0; i < 10; i++){
            if (age[i] >= 18){
                System.out.println("True");
            }
            else if (age[i] < 18){
                System.out.println("False");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student "+(i+1)+": ");
            age[i] = sc.nextInt();
        }
        can_stu_vote(age);
    }
}
