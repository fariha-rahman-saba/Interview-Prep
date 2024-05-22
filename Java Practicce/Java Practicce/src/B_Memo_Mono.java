import java.util.Scanner;

public class B_Memo_Mono {
    public static void main(String[] args){
        long a,b,k;
        Scanner sc = new Scanner(System.in);

        a = sc.nextLong();
        b = sc.nextLong();
        k = sc.nextLong();

        if (a%k==0 && b%k==0){
            System.out.println("Both");
        }
        else if (a%k==0){
            System.out.println("Memo");
        }
        else if (b%k==0){
            System.out.println("Momo");
        }
        else System.out.println("No One");
    }
}
