class Car{
    int carId;
    String modelName;
    long modelNo;
    String companyName;

//    Car HAS-A MusicSystem
    MusicSystem musicSystem; // entity reference of MusicSystem class
    Engine engine; // entity reference of Engine class

//    Passing both reference in the constructor along with there class name
    public Car(int carId, String modelName, long modelNo, String companyName,MusicSystem musicSystem,Engine engine){
        this.carId = carId;
        this.modelName = modelName;
        this.modelNo = modelNo;
        this.companyName= companyName;
        this.musicSystem = musicSystem;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", modelName='" + modelName + '\'' +
                ", modelNo=" + modelNo +
                ", companyName='" + companyName + '\'' +
                ", musicSystem=" + musicSystem +
                ", engine=" + engine +
                '}';
    }
}
public class AggregationDemo {
    public static void main(String[] args) {
        MusicSystem m1 = new MusicSystem(1,"JBL12","JBL");
        MusicSystem m2 = new MusicSystem(2,"Sony12","Sony");
        MusicSystem m3 = new MusicSystem(3,"Boat12","Boat");
        Engine e1 = new Engine(01,"carbureted");
        Engine e2 = new Engine(01,"FI");

        Car c1 = new Car(001,"Nexon",123456,"Tata", m1,e2);

        System.out.println(c1);

    }
}
