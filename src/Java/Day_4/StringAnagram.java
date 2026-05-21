package Java.Day_4;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Strings are not anagrams");
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
        }
    }
}
