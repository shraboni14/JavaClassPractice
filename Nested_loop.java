import java.util.Scanner;

public class Nested_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int input = sc.nextInt();

//STAR WITHOUT SPACE
        for (int i =1 ; i<=input; i++)
        {

            for (int j =input ; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k<=i ; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

//PYRAMID
        for (int i =1 ; i<=input; i++)
        {

            for (int j =input ; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k<=i ; k++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

//        REVERSE PYRAMID
        for (int i =1 ; i<=input; i++)
        {

            for (int j =1 ; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k = input; k>i ; k--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
