package Java.Day_4;

public class StringBufferDemo {
    public static void main(String[] args) {
        String s1 = new String("Nikhil ");
        s1.concat("sai");
        String s2 = s1.concat("Developer");
        s2.concat("Java");
        System.out.println(s1);
        System.out.println(s2);
    }
}