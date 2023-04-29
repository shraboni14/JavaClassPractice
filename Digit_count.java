import java.util.Scanner;

public class Digit_count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, count =0;
        System.out.println("Enter a value : ");
        int number = sc.nextInt(); // Initialization done

        for (;number!=0;){ // n > 0
            count ++;
            number = number / 10; // decrement
        }
        System.out.println("Number of digits are : " +count);

    }
}
