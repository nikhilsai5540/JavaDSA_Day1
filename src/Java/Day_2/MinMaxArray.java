public class MinMaxArray {
    /* public static int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    } 
    public static void main(String[] args) {
        int[] arr = {3, 0, 4, 1, 5, 9};
        int[] result = solution(arr);
        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    } */

    public static void main(String[] args) {
        int [] arr = {3, 0, 4, 1, 5, 9};
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum: " + min+ " Maximum: " + max);
    }
}
