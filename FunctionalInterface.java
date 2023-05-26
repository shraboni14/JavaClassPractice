interface GreetingMessage{
    public abstract void Greet(String name);
}
interface MessagePrinter{
    public abstract void Msg();
}
public class FunctionalInterface {
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
//            Using Functional Interface
            @Override
            public void Greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.Greet("Shraboni");

//        Using Lambda
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Welcome " + name);
        };
        gm2.Greet("Bubun");

//        Another example of Lambda
        MessagePrinter m = () -> {
            System.out.println("This is an message");
        };
        m.Msg();

    }
}
