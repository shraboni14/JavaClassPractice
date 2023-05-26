class Anudip{
    int id;
    String name;
    String location;

    Anudip(int id, String name, String location){ // Creating parameterised constructor
       this.id= id;
       this.name = name;
       this.location=location;
        System.out.println("ID - " + id + " NAME - " + name + " LOCATION - " + location);
    }
    Anudip(){

    }
    public Anudip(Anudip a1){
        id = a1.id;
        name = a1.name;
        location = a1.location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
public class Const_practice {
    public static void main(String[] args) {
//        Anudip shra = new Anudip(201, "Shraboni","Kolkata");
        Anudip tania = new Anudip();
        tania.setId(202);
        tania.setName("Tania Saha");
        tania.setLocation("Tollygunje");

        System.out.println("Tania's details is - " + tania.getId() + " , " + tania.getName() + " , " + tania.getLocation());

//        Anudip copy = new Anudip(shra);
        Anudip copy2 = new Anudip(tania);
        System.out.println(copy2.getName());

    }
}
