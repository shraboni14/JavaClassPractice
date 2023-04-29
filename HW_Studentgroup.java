import java.util.*;

public class HW_Studentgroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the roll number of the student: ");
        int rollNumber = input.nextInt();
        String group;

        if (rollNumber % 4 == 1) {
            group = "Sapphire";
        } else if (rollNumber % 4 == 2) {
            group = "Perl";
        } else if (rollNumber % 4 == 3) {
            group = "Ruby";
        } else {
            group = "Emerald";
        }

        System.out.println("The student belongs to the " + group + " group.");
    }
}
