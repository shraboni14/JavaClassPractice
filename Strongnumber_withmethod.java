import java.util.Scanner;

public class Strongnumber_withmethod {

    static void Calculate_strong(int n){
        int temp = n;
        int sum =  0;
        while (temp !=0){
            int rem = temp%10;
            //  INVOKING FACTORIAL
            int f = Factorial(rem);
            sum = sum + f;
            temp = temp/10;
        }
        if (sum == n){
            System.out.println("This is a strong number");
        }
        else {
            System.out.println("This is not a strong number");
        }
    }

    static int Factorial(int rem){
        int fact = 1;
        for (int i = 1; i<=rem; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        Calculate_strong(number);


    }
}
