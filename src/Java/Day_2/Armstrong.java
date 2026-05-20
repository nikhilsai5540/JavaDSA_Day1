
import java.util.Scanner;



public class Armstrong {
    // Method 1 

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length(); // Number of digits

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, n);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    } */

    // Method 2

   public static boolean solution(int num) {
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        temp = num;
        double result = 0;
        while (temp != 0) {
            int digit = temp %10;
            result = result + Math.pow(digit, count);
            temp /= 10;
        }
        return result == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (solution(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}