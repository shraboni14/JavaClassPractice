import java.util.Arrays;
import java.util.Scanner;
class Search {
    public void searchLinear(int[] arr, int key) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Element found at index " + (position+1));
        } else {
            System.out.println("Element not found");
        }
    }

    public int intsearchLinear(int[] arr , int key){
        int position = -1;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == key){
                position = i;
                break;
            }
        }
        return position;
    }

    public boolean bolSearchLiner(int[] arr , int key){
        boolean flag = false;
        for (int i = 0; i<arr.length ; i++){
            if (arr[i] == key){
                flag = true;
                System.out.println("Element found at position "+ (i+1));
                break;
            }
        }
        return flag;
    }

    public void samevalue(int[] arr, int key){
        int position = -1;
        int count = 0;
        for( int i=0; i<arr.length; i++){
            if(arr[i]==key){
                position = i;
                System.out.println("Element found at position " + (position+1));
                count = count+1;
            }
        }
    }
}


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,23,45,56,76,23,28,98,34};
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want to search - ");
        int number = sc.nextInt();

        Search s = new Search();
//        s.searchLinear(arr,number);
        int position = s.intsearchLinear(arr,number);
//        if(position!= -1){
//            System.out.println("Given Data " + number + "found on position " + (position+1));
//        }
//
//        if(!s.bolSearchLiner(arr,number))
//            System.out.println("Data not found");
        s.samevalue(arr,number);

    }
}
