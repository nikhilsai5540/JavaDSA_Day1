
import java.util.Scanner;

public class GreatestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The A is the greatest number");
        } else if (b > a && b > c) {
            System.out.println("The B is the greatest number");
        } else {
            System.out.println("The C is the greatest number");
        }
        sc.close();
    }
}
