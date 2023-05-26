class Indian{
    final long adharNo;
    final int b=8; // If you don't initialize the variable here, then you have to initialize it on constructor. Otherwise gives error

    static final int var = 98;
    static final int var2;
    final static int a; // Blank final variable.


    static { // We can only initialize a variable inside a static block. Can not declare.
        a =34;
        var2 = 34;
    }
    public Indian(long adharNo){

        this.adharNo = adharNo;
    }
    public long getAdharNo() {
        return adharNo;
    }
}

public class StaticProgram {
    public static void main(String[] args) {
        Indian shraboni = new Indian(123456789);
        System.out.println(shraboni.getAdharNo());
        System.out.println(Indian.a);
    }
}