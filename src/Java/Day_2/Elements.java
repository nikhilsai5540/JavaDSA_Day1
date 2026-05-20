
import java.util.Scanner;

//Sum of elements in an array
public class Elements {
    //Method 1
    /*public static int solution(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = solution(arr);
        System.out.println("The sum of the elements in the array is: " + result);
    } */

    //Method 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element at position "+i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}