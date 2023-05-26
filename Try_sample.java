import java.util.Scanner;

class Studentt
{
    int id;   //instance variable
    String name;
    String address;
    String degree;
    Scanner sc=new Scanner(System.in);

    void setData(int id,String name,String address,String degree)
    {
        id=id;
        name=name;
        address=address;
        degree=degree;
        System.out.println(id+" "+name);
    }


//void setData()
//{
//System.out.println("Enter Id");
//id=sc.nextInt();
//
//sc.nextLine();//consume delimiter
//System.out.println("Enter Name:");
//name=sc.nextLine();
//
//System.out.println("Enter address:");
//address=sc.nextLine();
//
//System.out.println("Enter Degree:");
//degree=sc.nextLine();
//}
    void getData()
    {
        System.out.println("Id:"+id+" Name:"+name+" Address:"+address+" Degree:"+
                degree);
    }
}
public class Try_sample {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //class instantiation -object creation
        Studentt gargy = new Studentt(); //object=instance
        //gargy.id=101;
        //gargy.name="Gargy";
        //gargy.address="kolkata";
        //gargy.degree="BCA";

        gargy.setData(101, "gargy", "kolkata", "BCA");
        gargy.getData();

        Studentt shrabani = new Studentt(); //object=instance
        shrabani.setData(102, "shrabani", "new barrackpur", "MCA");
        shrabani.getData();
    }
}

//3 way to initialize variable:
//1.using instance of class(not secure)
//2.using method(secure)
//3.using constructor(secure)