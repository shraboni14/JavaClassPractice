import java.util.Scanner;
public class Day_3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter an Alphabet : ");
//        char input = obj.next().charAt(0);
//
//        if(input=='a' ||input=='e'||input=='i'||input=='o'||input=='u'){
//            System.out.println("Your input is vowel");
//        } else if (input=='y') {
//            System.out.println("Sometimes it is vowel, sometimes it is consonent");
//
//        }
//        else {
//            System.out.println("It's consonent");
//        }
        System.out.println("Enter your Marks : ");
        int marks = obj.nextInt();

        if (marks>80){
            System.out.println("Your Grade is A");
        } else if (marks>70) {
            System.out.println("Your grade is B");
        } else if (marks>50) {
            System.out.println("Your grade is C");
        }
        else {
            System.out.println("Fail");
        }

    }
}
