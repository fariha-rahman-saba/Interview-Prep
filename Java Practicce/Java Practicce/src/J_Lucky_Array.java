import java.util.Scanner;

public class J_Lucky_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0],count=0;
        for(int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == min) {
                count++;
            }
        }
        if(count %2==1) {
            System.out.println("Lucky");
        }
        else System.out.println("Unlucky");
    }
}
