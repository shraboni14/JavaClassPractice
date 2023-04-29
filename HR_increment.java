import java.util.Scanner;
public class HR_increment {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Base salary of HR : ");
        int sal = sc.nextInt();
        System.out.println("Enter the recruit employee number : ");
        int emp_no = sc.nextInt();

        int increment=0;

        if (emp_no>=70){
            increment=(sal*20)/100;
        }
        else if(emp_no>=40){
            increment=((sal*15)/100);
        }
        else if(emp_no>=10)
            increment=((sal*10)/100);
        else
            System.out.println("There is no increment");

        sal+=increment;
        System.out.println("Updated salary:"+ sal);

    }


}
