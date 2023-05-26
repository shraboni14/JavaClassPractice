import java.util.Scanner;
import static java.lang.System.*;//static import
public class InsertElement {
    static int size;
    static Scanner sc=new Scanner(System.in);
    static {
        out.println("Enter size of elements: ");
        size=sc.nextInt();
    }
    public static int[] initializeArray()
    {
        int[] arr=new int[10];//specify the max size


        //value input till size
        out.println("Enter "+size+" Element in array");
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void insertElement(int[] arr,int pos) {
        int i,num;
        if(pos>size || pos<=0 || pos>arr.length)
        {
            out.println("Invalid position");
        } else
        {
            out.println("Enter element: ");
            num=sc.nextInt();

            for(i=size; i>=pos; i--)
            {
                arr[i]=arr[i-1];
            }
            //inserting the element at pos
            arr[pos-1]=num;
            size++;

            out.println("new array");
            for(i=0;i<size;i++) {
                out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr=initializeArray();
        out.println("Enter position to insert element:");
        int pos=sc.nextInt();
        insertElement(arr,pos);
    }
}