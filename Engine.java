public class Engine {
    int id;
    String name;
     public Engine(int id, String name){
         this.id = id;
         this.name = name;
     }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
