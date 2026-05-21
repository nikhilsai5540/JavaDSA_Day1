package Java.Day_4;

public class DiagonalArray {
    public static int solution(int[][] arr) {
        int size = arr.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i]; 
            sum += arr[i][size - 1 - i];
        }
        System.out.println("Sum of diagonal elements: " + sum);
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(solution(arr));
    }
}
