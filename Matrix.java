public class Matrix {
    public static void main(String[] args) {
        int[] arr = {12,42,21,45,2,45,10};
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for(int number : numbers) {
//            if(number > largest) {
//                secondLargest = largest;
//                largest = number;
//            } else if (number > secondLargest && number != largest) {
//                secondLargest = number;
//            }
//        }

        int max, secmax;
        max = arr[0];
        secmax = arr[1];


        for(int i = 2; i< arr.length; i++)
        {
            if (arr[i]>max && arr[i] > secmax)
            {
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > secmax)
            {
                secmax = arr[i];
            }
        }

        System.out.println("The second largest number is: " + secmax);








        int a1[][] = {{1,2,3,4},{3,4,5,6},{5,6,7,8},{7,8,9,10}};

//        1 2 3 4
//        3 4 5 6
//        5 6 7 8
//        7 8 9 10
//
//        3D

        int a2[][][] = {{{1,2},{3,4}},{{3,4},{5,6}},{{5,6},{7,8}}};

        int [][][] a3 = {{{1,2,3},{2,3,4},{4,5,6}}};

//        {1,2,3}  {2,3,4}  {4,5,6}

//        {1,2}   {3,4}
//
//        {3,4}   {5,6}
//
//        {5,6}   {7,8}



    }
}
