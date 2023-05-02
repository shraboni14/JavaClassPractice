import java.util.Scanner;

public class Profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter purchase amount : ");
        int purchase = sc.nextInt();

        System.out.println("Enter Selling amount");
        int sell = sc.nextInt();

        if (sell>purchase){
            int pl = (sell-purchase);
            System.out.println("Your profit amount is : " + pl);
        }
        else {
            int pl = (purchase-sell);
            System.out.println("Your loss amount is : " + pl);
        }
    }
}
