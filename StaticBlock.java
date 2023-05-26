import java.util.Scanner;

public class StaticBlock {
    static String name;
    static int id;

    // Static block to initialize static variables
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter id: ");
        id = scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
