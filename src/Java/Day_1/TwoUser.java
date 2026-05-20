
import java.util.Scanner;

public class TwoUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char op = sc.next().charAt(0);
        int result;
        switch (op) {
            case '+':
                result = n1 + n2;
                // System.out.println(result);
                break;
            case '-':
                result = n1 - n2;
                // System.out.println(result);
                break;
            case '*':
                result = n1 * n2;
                // System.out.println(result);
                break;
            case '/':
                result = n1 / n2;
                // System.out.println(result);
                break;
                
            case '%':
                result = n1 % n2;
                // System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(result);
    }
}
