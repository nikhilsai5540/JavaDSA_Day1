package Java.Day_4;

public class ConstructorImplement {
    public static void main(String[] args) {
        /*char[] ch = {'N', 'i', 'k', 'h', 'i', 'l'};
        String s1 = new String(ch);

        byte[] b = {65, 66, 67, 68, 69};
        String s2 = new String(b);

        System.out.println(s1+" "+s2);

        String s = "develoker";

        s = s.replace('k', 'p');
        System.out.println(s);

        System.out.println(s.substring(4)); */


        /*String s1 = "Nikhil";
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s4); */

        StringBuilder sb = new StringBuilder("Nikhil");
        sb.append("123456789123456000");
        System.out.println(sb.capacity() + " " + sb.length());
        
    }
}
