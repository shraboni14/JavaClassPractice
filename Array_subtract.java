public class Array_subtract {
    public static void main(String[] args) {
        int a [][] = {{1,2,3},{4,5,6},{1,5,2}};
        int b [][] = {{2,5,1},{2,4,3},{1,2,1}};
        int c[][] = new int[3][3];

        System.out.println("Subtraction answer is : ");
        for (int i = 0 ; i<3; i++){
            for (int j = 0; j<3 ; j++){
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
