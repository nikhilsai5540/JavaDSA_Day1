package Java.Day_4;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s1 = sc.nextLine();
        String s2 = "";
        for(int i=s1.length()-1; i>=0; i--){
            s2 = s2 + s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
