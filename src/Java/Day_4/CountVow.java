package Java.Day_4;

public class CountVow {
    public static void main(String[] args) {
        String s1 = new String("Nikhil@123");
        int vow = 0, cons = 0, num = 0, spe = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'   || ch == 'O' || ch == 'U') {
                vow++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                cons++;
            } else if (ch >= '0' && ch <= '9') {
                num++;
            } else {
                spe++;
            }
        }
        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);
        System.out.println("Numbers: " + num);
        System.out.println("Special Characters: " + spe);
    }
}
