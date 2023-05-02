import java.util.Scanner;

public class Student_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Marks of 1st Subject : ");
        double m1 = sc.nextDouble();
        System.out.println("Enter your Marks of 2nd Subject : ");
        double m2 = sc.nextDouble();
        System.out.println("Enter your Marks of 3rd Subject : ");
        double m3 = sc.nextDouble();
        System.out.println("Enter your Marks of 4th Subject : ");
        double m4 = sc.nextDouble();
        System.out.println("Enter your Marks of 5th Subject : ");
        double m5 = sc.nextDouble();
        double total = (m1 + m2 + m3 + m4 + m5);
        double percent = ((total / 500) * 100);

        System.out.println("Your Percentage is : " + percent);


        if (percent >= 90 && percent < 100) System.out.println("Grade A");
        else if (percent >= 80 && percent < 90) System.out.println("Grade B");
        else if (percent >= 70 && percent < 80) System.out.println("Grade C");
        else if (percent >= 60 && percent < 70) System.out.println("Grade D");
        else if (percent >= 40 && percent < 60) System.out.println("Grade E");
        else System.out.println("Grade F");


    }
}
