class Userr implements Cloneable{
    int id;
    String name;
    String address;
    public Userr(int id,String name,String address) {
        super();
        this.id=id;
        this.name=name;
        this.address=address;

    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();//invoked object class() clone() method
    }
    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("Userr id - ").append(id).append(",name - ").append(name).append(",Address - ").append(address).append("]");
        return builder.toString();
    }
}


public class TaggerOrMarkerInterface{

    public static void main(String[] args) {

        Userr user1=new Userr(101,"Shraboni","New Barrckpur");
        try {
            Userr user2=(Userr)user1.clone();//copy user1 to user2
            System.out.println("user1: "+user1);
            System.out.println("user2: "+user2);

        }catch(Exception e) {
            System.out.println(e);
        }
    }

}