public class Pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++){
            for (int j = n; j>i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

//        int rows = 5;
//        for (int i = rows; i > 0; i--) { // i= 5// i=4
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



    }

}
