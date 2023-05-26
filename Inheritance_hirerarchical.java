abstract class Bank1{
    abstract float rateOfInterest();
    abstract void msg();
    void fun(){
        System.out.println("hi");
    }
}
class Sbi extends Bank1{
    @Override
    float rateOfInterest() {
        return 6.0f;
    }

    @Override
    void msg() {

    }

    @Override
    void fun() {
        System.out.println("I am SBI");
    }
}
class Axis extends Bank1{
    @Override
    float rateOfInterest() {
        return 10.0f;
    }

    @Override
    void msg() {

    }

    @Override
    void fun() {
        System.out.println("I am axis");
    }
}
public class Inheritance_hirerarchical {
    public static void main(String[] args) {
        Bank1 a;
        a = new Axis();
//        Axis a = new Axis();
        a.fun();
        System.out.println(a.rateOfInterest());


    }
}
