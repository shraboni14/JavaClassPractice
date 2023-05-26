public class MusicSystem {
    int id;
    String modelName;
    String companyName;
    public MusicSystem(int id, String modelName, String companyName){
        this.id = id;
        this.modelName = modelName;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "MusicSystem{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
