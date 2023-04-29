import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int [] arr = {9,2,6,4,1,7,3};


//        for(int i =0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-1;j++ ){
//                int temp;
//                if (arr[j]>arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));



        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++ ){
                int temp;
                if (arr[j]<arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println("The second largest number is: " + arr[1]);


    }
}
