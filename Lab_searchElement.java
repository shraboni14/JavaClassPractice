import java.util.Arrays;
import java.util.Scanner;

public class Lab_searchElement {
//Method for performing search operation
    public static boolean SearchLiner(int[] arr , int key){
        boolean flag = false;   // taking by default false flag value
        for (int i = 0; i<arr.length ; i++){
            if (arr[i] == key){
                flag = true;    // When element find the flag became true
                System.out.println("Element found at position "+ (i+1));
                break;  // After getting the desire value the loop will be break and finished
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,76,23,28,98,34};   // Declare and initialize the array with values
        System.out.println(Arrays.toString(arr));   //Printing the array

        Scanner sc = new Scanner(System.in);    // Creating scanner class object
        System.out.println("Enter a number you want to search - ");
        int number = sc.nextInt();  // taking input from user

        if(!SearchLiner(arr,number))    //search method call and condition checking
            System.out.println("Data not found");
    }
}
