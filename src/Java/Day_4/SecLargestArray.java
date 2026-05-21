package Java.Day_4;

/*public class SecLargestArray {
    public static void solution(int [] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if it's greater than current second largest and not equal to largest
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,5,4,7,0,77,0,9,8,00,2,1};
        solution(arr);
    }
} */


public class SecLargestArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 4, 7, 0, 77, 0, 9, 8, 00, 2, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest before updating largest
                largest = num; // Update largest
            } else if (num > secondLargest /*&& num != largest*/) {
                secondLargest = num; // Update second largest if it's greater than current second largest and not equal to largest
            }
        }
        System.out.println(+secondLargest);
    }
}
