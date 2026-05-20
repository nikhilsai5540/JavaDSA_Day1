
import java.util.Scanner;

public class SwapUsing3rdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping: " + a + " " + b);
        sc.close();
    }
}