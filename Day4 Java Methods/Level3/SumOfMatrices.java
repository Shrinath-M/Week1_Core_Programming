import java.util.*;

public class SumOfMatrices {
    public static int[][] sum_two(int[][] arr1, int[][] arr2, int r, int c) {
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;

        System.out.println("Enter number of rows:");
        r = sc.nextInt();
        System.out.println("Enter number of columns:");
        c = sc.nextInt();

        int[][] arr1 = new int[r][c];
        int[][] arr2 = new int[r][c];

        System.out.println("Enter elements of arr1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of arr2:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] sum_res = sum_two(arr1, arr2, r, c);

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum_res[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

