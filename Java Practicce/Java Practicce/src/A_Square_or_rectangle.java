import java.util.Scanner;

public class A_Square_or_rectangle {
    public static void main(String[] args) {
        int t,w,h;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();

        while(t>0){
            w=sc.nextInt();
            h=sc.nextInt();
            if(w==h){
                System.out.println("Square");
            }
            else System.out.println("Rectangle");
            t--;

        }
    }
}
