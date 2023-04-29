import java.util.Scanner;
public class Question3_HR {
    public static void main(String[] args) {
        double basicSalary, grossSalary, hra, da;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        basicSalary = scanner.nextDouble();

        if (basicSalary > 1500) {
            hra = 0.2 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 500;
            da = 0.7 * basicSalary;
        }

        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);
    }
}
