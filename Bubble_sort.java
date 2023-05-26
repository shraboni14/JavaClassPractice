import java.util.Arrays;
public class Bubble_sort {
//    This case large element will sorted last of the array
    static void bubble(int[] arr){
        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++ ){
                int temp;
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array is " + Arrays.toString(arr));
    }

    static int[] bubbleSort(int[] arr)
    {
        int temp,i,j;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])  //arr[3]>arr[4]
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {9,2,6,4,1,7,3};
        System.out.println("Previous array is " + Arrays.toString(arr));
        bubble(arr);
// SECOND LARGEST NUMBER
//        for(int i =0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-1;j++ ){
//                int temp;
//                if (arr[j]<arr[j+1]){
//                    temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        //System.out.println(Arrays.toString(arr));
//        System.out.println("The second largest number is: " + arr[1]);
    }
}
