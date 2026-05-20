
import java.util.Scanner;

public class FiveMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in 5 subjects: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        int totalMarks = s1 + s2 + s3 + s4 + s5;
        double percentage = (totalMarks / 5.0);
        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("Grade: C");
        } else if (percentage >60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: Fail");
        }
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Total Marks: " + totalMarks);
        sc.close();
    }
}
