interface Bicycle{
    int a = 45; // If I give any value in Interface then the value is final
    void speedUp(int increment);
    void speedDown(int decrement);

    private void location() {

    }
}
class AvonCycle implements Bicycle{

    void name(){
        System.out.println("My name is Avon Cycle");
    }
    @Override
     public void speedUp(int increment) {
        System.out.println(" Your increment speed is - " +increment);
    }

    @Override
    public void speedDown(int decrement) {
        System.out.println("Your decrement speed is - " + decrement);
    }
}
public class InterfaceBicycle {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.speedDown(12);
        System.out.println(c.a);
    }
}
