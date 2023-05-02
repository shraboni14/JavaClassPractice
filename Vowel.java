import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an String : ");
        String input = sc.nextLine().toLowerCase();

        int count =0; // This variable count by increasing it's value when it'll get vowels.

        for (int i = 0; i < input.length(); i++){ // i will traverse from start to end all indexes of the string
            char ch = input.charAt(i); // if it find a character in i-th index then count will be increased
            if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch=='u' ){
                count ++;
            }
        }
        System.out.println("Number of vowel is : " + count);
    }
}
