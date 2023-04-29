

public class test{
    public static void main(String[] args) {

        int a =14, b = 8 , count =0;
        if (a>b) {
            count = b;
        }else {
            count=a;
        }
        while (true) {
            if (count%a==0 && count%b==0) {
                System.out.println("L.C.M. is : "+count);

//                if(count == 500) {
//                    break;
//                }

            }
            System.out.print(count + ",");
            count++;
            if(count == 158000) {
                break;
            }
        }

    }
}