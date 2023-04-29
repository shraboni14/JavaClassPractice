import java.util.Scanner;
public class Vaccination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        String gender;

        System.out.println("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine(); // Consume delimiter
        System.out.println("Enter your Gender: ");
        gender = sc.nextLine();

        if ((age>=18) && (gender.equalsIgnoreCase("male"))||
                (gender.equalsIgnoreCase("female")))
        {
            System.out.println("You are eligible for vaccination");
        }
        else{
            System.out.println("You are not eligible");
        }

    }
}
