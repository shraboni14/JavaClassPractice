import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n-th term of Fibonacci series : ");
        int count = sc.nextInt();

        int n1 = 0, n2 = 1 , n3; // We are taking first value 0 and second value 1
        System.out.print(n1 + " " + n2); // Print 1st and 2nd value

        for (int i = 2;i<count;i++){ // Already print 0 and 1 , so loop starts from 2.
            n3= n1+n2; // n3 is the summation of previous two numbers.
            System.out.print(" " + n3);

            n1 = n2; // Updating the value of n1 by n2
            n2 = n3;  // Updating the value of n2 by n3

            /*
            1st Iteration   ||  2nd Iteration   ||  3rd Iteration   ||  4th Iteration   ||  5th Iteration
            n1 = 0          ||  n1 = n2 = 1     ||  n1 = n2 = 1     ||  n1 = n2 = 2     ||  n1 = n2 = 3
            n2 = 1          ||  n2 = n3 = 1     ||  n2 = n3 = 2     ||  n2 = n3 = 3     ||  n2 = n3 = 5
            n3 = 1          ||  n3 = 2          ||  n3 = 3          ||  n3 = 5          ||  n3 = 8
             */
        }
    }
}
