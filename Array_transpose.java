public class Array_transpose {
    public static void main(String[] args) {
        int[][] original = {{1,2,3},{3,4,6},{1,8,5}};
        int[][] transpose = new int [3][3];

        for(int i = 0; i<3; i++){
            for(int j =0; j<3; j++){
//                original[i][j] = transpose[j][i];
                transpose[i][j]=original[j][i];
            }
            System.out.println(" ");
        }

        System.out.println("Original matrix is : ");
        for ( int i = 0; i<3 ;i++){
            for (int j= 0; j<3;j++){
                System.out.print(original[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpose matrix is : ");
        for ( int i = 0; i<3 ;i++){
            for (int j= 0; j<3;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
