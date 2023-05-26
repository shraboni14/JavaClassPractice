class University{ // 1st class -> Parent Class
    int collegeId;
    String collegeName;
    String location;
    public University(int collegeId, String collegeName, String location){ // constructor
        this.collegeId=collegeId;
        this.collegeName=collegeName;
        this.location=location;
    }
    void display(){
        System.out.println("College id is - " + collegeId + " Name is - " +collegeName + " Location is - " + location);
    }
}
class College extends University{ //2nd class inherit 1st class
    String faculty;
    public College(int collegeId, String collegeName, String location, String faculty) { // Constructor
        super(collegeId,collegeName,location);
        this.faculty = faculty;
    }
    void display() {
        super.display();
        System.out.println("Faculty name is - " +faculty);
    }
}
class Learner extends College { // 3rd class inherit 2nd class
    int phoneNo;
    public Learner(int collegeId, String collegeName, String location, String faculty, int phoneNo) {
        super(collegeId,collegeName,location,faculty);
        this.phoneNo = phoneNo;
    }
    void display() {
        super.display();
        System.out.println("Phone no is - " + phoneNo);
    }
}
public class MultilevelInheritance {
        public static void main(String[] args) {
            Learner stu = new Learner(101, "Techno India", "kolkata", "MCA", 869758);
            stu.display();
        }
    }
