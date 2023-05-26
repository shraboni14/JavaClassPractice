//interface inherit interface
//class implement Interface

interface A{
    void fun();
    default void cook(){  // If we write any method default then it'll not generate any error for those class who are implementing this interface.
        System.out.println("I am cooking");
    }
    static void checkEquality(String a, String b){
        if (a!=null && b!=null){
            if (a.equals(b)){
                System.out.println("Inputs are equal");
            }else {
                System.out.println("Inputs are not equal");
            }
        }else {
            System.out.println("Both are null");
        }
    }
    static void accessMethod(){
        description();
    }
    private static void description(){
        System.out.println("This is a private method");
    }
}

interface B extends A{
    int x=34;
    void method1();
	default void say(){
        System.out.println("From java 8 we can have default method in Inheritance");
    }
}

interface C extends A{
    int x=90;
    void method2();
//	int say();
}

class D implements B,C{
    @Override
    public void fun() {
        System.out.println("We are doing fun");
    }

    public void method1() {
        System.out.println("This is method1");
    }

    public void method2() {
        System.out.println("This is method2");
    }

    @Override
    public void cook() {
        B.super.cook();
    }
}
public class MultipleinhertanceUsingInterface {
    public static void main(String[] args) {

        D obj=new D();
        obj.fun();
        obj.method1();
        obj.method2();
//if we have same var name in two interface we just need to call by interfacename.var
        System.out.println(C.x);
        obj.cook();
        obj.say();
        A.checkEquality("shraboni","shraboni");
        A.accessMethod();
    }

}