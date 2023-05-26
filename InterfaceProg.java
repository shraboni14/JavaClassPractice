interface IN{
    int x = 90;
    void fun();
}
interface MyInterface{
    void msg();
}
class Multi{
    void say(){
        System.out.println("Sayable");
    }
}
class Impl extends Multi implements IN,MyInterface{

    @Override
    public void fun() {
        System.out.println("We are doing fun");
    }

    @Override
    public void msg() {
        System.out.println("We are implementing method");
    }
}

public class InterfaceProg {
    public static void main(String[] args) {
        Impl o = new Impl();
        o.fun();
        o.msg();

    }
}
