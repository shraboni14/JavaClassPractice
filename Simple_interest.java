import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle amount : ");
        double principal = sc.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double rate = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}
