import java.util.Scanner;

public class student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll number");
        short Roll_no = sc.nextShort();

        System.out.println("Enter age");
        byte age = sc.nextByte();

        System.out.println("Enter Mobile Number");
        long mob_no = sc.nextLong();

        System.out.println("Enter Attendance");
        float Attend = sc.nextFloat();

        System.out.println("Enter Marks");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;
        float Average = total / 3.0f;
        float percentage = (total / 300.0f) * 100;

        System.out.println("Total marks = " + total);
        System.out.println("Average marks = " + Average);
        System.out.println("Percentage = " + percentage);

        String StudentGrade = (percentage >= 95) ? "Ex" :
                              (percentage >= 90) ? "AA" :
                              (percentage >= 75) ? "AB" :
                              (percentage >= 50) ? "CC" :
                              (percentage >= 35) ? "DD" :
                              "FF";

        System.out.println("Grade = " + StudentGrade);

        if (percentage >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}