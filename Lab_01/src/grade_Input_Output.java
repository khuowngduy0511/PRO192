import java.util.Scanner;

public class grade_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the attendence grade: ");
        double a = sc.nextDouble();
        System.out.print("Enter the midterm grade: ");
        double b = sc.nextDouble();
        System.out.print("Enter the final grade :");
        double c = sc.nextDouble();
        double d = grades(a,b,c);
        System.out.println("Your course grade is: "+d);
    }
    public static double grades(double attendance, double midterm, double finalGrades) {
        double courseGrade = attendance * 0.1 + midterm * 0.2 + finalGrades * 0.7;
        return courseGrade;
    }
}

