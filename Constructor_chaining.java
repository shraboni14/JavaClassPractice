// IT ALSO CALLED CONSTRUCTOR OVERLOADING

class Chaining{
    int id;
    int marks;
    String name;
    String department;
    String college;
    static String university = "MAKAUT";

    Chaining(int id, int marks, String name, String department, String college){
        this.id = id;
        this.marks = marks;
        this.name = name;
        this.department = department;
        this.college = college;
    }
    Chaining(){
        super();
    }
    Chaining(Chain v){
        v.id = id;
        v.marks = marks;
        v.name = name;
        v.department = department;
        v.college = college;
    }
    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getCollege() {
        return college;
    }

    public static String getUniversity() {
        return university;
    }

    void display(){
        System.out.println("Student details is - " + getId()+" , " +getMarks()+" , "+getName()+" , "+getDepartment()+" , "+getCollege()+" , "+getUniversity());
    }
}

public class Constructor_chaining {
    public static void main(String[] args) {
        Chain c1 = new Chain();
        Chain c2 = new Chain(12,80,"Shraboni","MCA","Techno India");
        Chain c3 = new Chain(18,90,"Bipasa Das","BCA","Gurunanak");
        c2.display();
        c1.display();
    }
}