
class Stud{
    int id;
    String name;
    String address;
    String degree;

    void setdata(int id, String name, String address, String degree){
        this.id = id;
        this.name = name;
        this.address = address;
        this.degree = degree;
        System.out.println("This : " +this);
        this.getdata();
    }
    void getdata(){
        System.out.println("Id : "+id + " ,Name : "+name + " ,Address : " + address + " ,Degree : " + degree);
    }
}
public class oop_example {
    public static void main(String[] args) {
            Stud shraboni = new Stud();
            Stud tanmoy = new Stud();

            shraboni.setdata(12,"shraboni","New-Barrackpur", "MCA");
            //shraboni.getdata();

            tanmoy.setdata(13,"tanmoy", "Dankuni", "MCA");
            //tanmoy.getdata();
        System.out.println("The value of the shraboni is : "+shraboni);
    }
}
