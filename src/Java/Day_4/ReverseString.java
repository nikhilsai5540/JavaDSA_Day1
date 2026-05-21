package Java.Day_4;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("Nikhil");
        String s2 = "";
        for(int i=s1.length()-1; i>=0; i--){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }
}
