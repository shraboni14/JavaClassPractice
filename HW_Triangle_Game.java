import java.util.Scanner;
public class HW_Triangle_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = input.nextInt();
        System.out.println("Enter the second value");
        int b = input.nextInt();
        System.out.println("Enter the third value");
        int c = input.nextInt();

        String result = String.valueOf((a + b + c));

        System.out.println(result);

        if (a+b+c == 180 && a>0 && b>0 && c>0){
            if(a==b && b==c){
                System.out.println("Pizza 3");
            }
            else if (a == 90 || b == 90 || c == 90){
                System.out.println("Pizza 2");
            }
            else {
                System.out.println("Pizza 1");
            }

        }else {
            System.out.println("No pizza");
        }


    }
}




