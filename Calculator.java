class caltu{
    int add(int a, int b){
        int sum = a+b;
        System.out.printf(" The addition of %d and %d number is : ",a,b);
        System.out.print(sum);
        return sum;
    }
    int subtract(int a, int b){
        int sub = a-b;
        System.out.println();
        System.out.printf(" The subtraction of %d and %d number is : ",a,b);
        System.out.print(sub);
        return sub;
    }
    int multi(int a, int b){
        int multi = a*b;
        System.out.println();
        System.out.printf(" The Multiplication of %d and %d number is : ",a,b);
        System.out.println(multi);
        return multi;
    }
    double div(double a, double b){
        double div = a/b;
        System.out.println(" The division of two number is : "+div);
        return div;
    }
}
public class Calculator {
    static {
        System.out.println("This is a calculator program");
    }
    public static void main(String[] args) {
        caltu c1 = new caltu();
        c1.add(4,5);
        c1.subtract(10,3);
        c1.multi(3,6);
        c1.div(6,2);

        int x = 34;
        int y = 65;
        System.out.println(Math.max(x,y));

        String n1 = "Shraboni";
        String n2 = "Shraboni";
        String n3 = "Bubun";

        if(n1.equals(n2)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
