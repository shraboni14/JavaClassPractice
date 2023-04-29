import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int num2 = input.nextInt();
//
//        System.out.print("Enter the third number: ");
//        int num3 = input.nextInt();
//
//        int largest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
//
//        System.out.println("The largest number is " + largest);

//      LEAP YEAR OR NOT

//        System.out.print("Enter a year: ");
//        int year = input.nextInt();
//
//        String isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "is" : "is not";
//
//        System.out.println(year + " " + isLeapYear + " a leap year.");

//        FIND THE VALUE OF FX
        System.out.print("Enter a value for x: ");
        double x = input.nextDouble();
        double fx;

        if (x > 0 && x < 10) {
            fx = x + 2;
        } else if (x >= 10) {
            fx = (x*2) + 2;
        } else {
            System.out.println("Invalid input. x must be greater than 0.");
            return;
        }

        System.out.println("The value of fx is: " + fx);


    }
}
