class Studenttt{
    int id;
    String name;
    String address;
    String degree;

    static String institute = "Anudip Foundation";
    static int count = 0;

    public Studenttt(int id, String name, String address , String degree){
        this.id = id;
        this.name = name;
        this.address = address;
        this.degree = degree;
        count ++;
        System.out.println("No of count " + count);
    }

    static void UpdateInstituteName(){
        institute = "Anudip Foundation For Social Welfare";
    }

    public Studenttt()
    {
        super();
    }
    public Studenttt(Studenttt s1){
        id=s1.id;
        name=s1.name;
        address=s1.address;
        degree=s1.degree;

    }
//    public Studenttt(int id, String name, String address,String degree){
//        this(id,name,address);
//        this.degree=degree;
//    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public static String getInstitute() {
        return institute;
    }
}

public class Construct {
//    @Override
//    public String toString() {
//        return "Construct{}";
//    }

    public static void main(String[] args) {
        Studenttt shraboni = new Studenttt(101,"Shraboni","Kolkata","MCA");
        System.out.println("Id is - " + shraboni.getId()+" Name : " +shraboni.getName() + " Address : " + shraboni.getAddress() + " Degree : " + shraboni.getDegree());

        Studenttt deesha = new Studenttt(101,"deesha","Kolkata","BCA");
        Studenttt anupama = new Studenttt(101,"anupama","Kolkata","BCA");
        Studenttt chandrima = new Studenttt(101,"chandrima","Kolkata","Btech");
        System.out.println("Number of student enrolled - " + Studenttt.count); // static variable k className.variableName likhe call korte hoy.

        Studenttt riya = new Studenttt();
        riya.setId(102);
        riya.setName("Riya Das");
        riya.setAddress("Kolkata");
        riya.setDegree("BCA");

        Studenttt.UpdateInstituteName(); // Static variable bole class name dia call korte hobe. Next line e institute er nam change hye geche.
        System.out.println(" ID is - " + riya.getId() + " Name - " + riya.getName() + " Address - " + riya.getAddress() + " Degree - " + riya.getDegree() + "Institute : " + Studenttt.getInstitute());
//        System.out.println(riya.degree);

        Studenttt copystu = new Studenttt(shraboni);
        System.out.println("Copy data - name - " + copystu.getName());

        System.out.println(riya);


    }

}
