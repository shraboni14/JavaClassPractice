abstract class HillStations{ // Creating parent abstract class
    abstract void location();
    abstract void famousFor();

}
class Manali extends HillStations{ // Creating subclass Manali

    @Override
    public void location() {
        System.out.println("Manali");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for cool climate and snow-capped mountains");
    }
}
class Mussoorie extends HillStations{ // Creating subclass Mussoorie

    @Override
    public void location() {
        System.out.println("Mussoorie");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for scenic beauty, good social life and entertainment");
    }
}
class Gulmarg extends HillStations{ // Creating subclass Gulmarg

    @Override
    public void location() {
        System.out.println("Gulmarg");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for to enjoy a splendid vacation in the hills.");
    }
}
public class InheritanceHillStation {
    public static void main(String[] args) {
        HillStations h; // Reference variable type parent
        h = new Mussoorie(); // Upcasting
        // Displaying Mussoorie information
        h.famousFor();
        h.location();

        h = new Manali();// Upcasting
        // Displaying Manali information
        h.famousFor();
        h.location();

        h = new Gulmarg();// Upcasting
        // Displaying Gulmarg information
        h.famousFor();
        h.location();

    }
}
