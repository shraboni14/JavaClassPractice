import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int temp = num;
        int sum =0;

        while (temp>0){
            int rem = temp%10;
            int fact =1;
            for (int i =1; i<=rem; i++){
                fact = fact*i;
            }
            sum = sum+fact;
            temp = temp/10;
        }
        if (sum==num){
            System.out.println("This is a strong number");
        }
        else {
            System.out.println("This is not a strong number");

    }
}
}
