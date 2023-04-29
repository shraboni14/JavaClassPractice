import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int col = sc.nextInt();

        int[][] arr= new int [row][col];

        // input
        for(int i=0; i<row; i++){
            for (int j =0; j<col; j++){
                System.out.printf("Taking the position row %d and column %d ",i,j);
                arr[i][j] = sc.nextInt();
            }
        }
// FINDING A PARTICULAR INDEX IN AN ARRAY
        System.out.println("Enter the value you want to search");
        int srch = sc.nextInt();
        for (int i = 0; i<row; i++){
            for (int j =0; j < col; j++){
                // Compare now
                if (arr[i][j] == srch){
                    System.out.printf("Number found in the position of col %d and row %d ",i,j);
                }
            }
        }
        // Output
//        System.out.println("Printing the array");
//        for (int a[]:arr) {
//            for (int b:a) {
//                System.out.print(b);
//
//            }
//            System.out.println("");
//
//        }
    }

}
