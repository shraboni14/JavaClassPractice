import java.util.Arrays;
import java.util.Scanner;
public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = new int[10];    // SPECIFY A MAX SIZE
        int size, number, position;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of element in array : ");
        size = scanner.nextInt();

        System.out.println("Enter " + size + "elements in an array ");
        for (int i=0; i<size ; i++){
            System.out.println("Enter the array element- ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter position to enter new element : ");
        position = scanner.nextInt();

        if(position>size || position<0 || position> arr.length){
            System.out.println("Invalid position");
        }else {
            System.out.println("Enter the element : ");
            number = scanner.nextInt();
//            SHIFTING CODE
            for (int i = size; i>position; i--){
                arr[i] = arr[i-1];
            }
//            INSERTING NEW ELEMENT IN A SPECIFIC POSITION
            arr[position-1] = number;   //arr[2-1] arr[1]=78
            size++; //size+1

            System.out.println("After inserting new array is : ");
            System.out.println(Arrays.toString(arr));
        }
    }
}