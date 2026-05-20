

public class SumOfArrays {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the arrays: ");
        size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] sumArray = new int[size];
        for (int i = 0; i < size; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }
        System.out.println("The sum of the arrays is:");
        for (int i = 0; i < size; i++) {
            System.out.print(sumArray[i] + " ");
        }
        System.out.println();
    }*/

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {6, 7, 8, 9, 10};
        int sumArray[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sumArray[i] = arr1[i] + arr2[i];
        }
        System.out.println("The sum of the arrays is:");
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i] + " ");
        }
        System.out.println();
    }
}
