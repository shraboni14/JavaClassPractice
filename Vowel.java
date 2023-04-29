import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Alphabet : ");
        char input = sc.next().charAt(0);

        if((input == 'a'||input == 'A')|| (input == 'e'||input == 'E')||(input == 'i'||input == 'I')||(input == 'o'||input == 'O')||(input == 'u'||input == 'U')){
            System.out.println("The character is vowel");
        }
        else {
            System.out.println("The character is consonant");
        }
    }
}
