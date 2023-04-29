import java.util.*;
public class Chase_Board {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a alphabet between A to H : " );
        String column = input.next();
        System.out.println("Enter a number between 1 to 8 : ");
        int row = input.nextInt();

        boolean isBlack = ((row % 2 == 0) && (column.charAt(0) % 2 == 0) || (row % 2 != 0) && (column.charAt(0) % 2 != 0));
//        boolean isBlack = ((row % 2 == 0) && (column.charAt(0) % 2 != 0)) || ((row % 2 != 0) && (column.charAt(0) % 2 == 0));
        //                  1%2 != 0 (false) && 4%2 =0 (false) || 1 % 2 =!0(true) && 4 % 2 = 0(true)
        //        2D

        String color = isBlack ? "Black" : "White";
//        String color = isBlack ? "White" : "Black";

        System.out.println("The block at " + row + column + " is " + color + ".");
    }
}


//    char col ='a';
//    int row =1;
//		if((col=='a' || col=='c'||col=='e'||col=='g') &&(row==1 ||row==3||row==5||row==7))
//                {
//                System.out.println("Black block");
//                }
//                else if((col=='b' || col=='d'||col=='f'||col=='h') &&(row==2 ||row==4||row==6||row==8))
//                {
//                System.out.println("Black block");
//                }


// 1st row - column, row both odd - black
// 2nd row - column , row both even - black

//1st row - column, row both even - white
// 2nd row - column, row both odd - white