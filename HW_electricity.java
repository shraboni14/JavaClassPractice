import java.util.Scanner;

public class HW_electricity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = input.nextInt();
        double bill;

        if (units <= 100) {
            bill = units * 1.20;
        } else if (units <= 300) {
            bill = 100 * 1.20 + (units - 100) * 2;
        } else {
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("Your electricity bill is Rs. " + bill);
    }
}
