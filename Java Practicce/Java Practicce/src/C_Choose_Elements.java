import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C_Choose_Elements {
    public static void main(String[] args) {
        int n,k,sum=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = n-1;  i>=n-k; i--) {

                sum+= arr[i];

        }
        System.out.println(sum);


    }
}
