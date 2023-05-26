// WE DON'T NEED CONSTRUCTOR IN THIS CASE.
class TechnoIndia{
    private int roll_no;
    private String name;
    private String department;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

public class SetterGetter {
    public static void main(String[] args) {
        TechnoIndia shraboni = new TechnoIndia();
        shraboni.setRoll_no(101);
        shraboni.setName("Shraboni Sinha");
        shraboni.setDepartment("MCA");

        System.out.println(shraboni.getRoll_no());
        System.out.println(shraboni.getName());
        System.out.println(shraboni.getDepartment());

        TechnoIndia priyanka = new TechnoIndia();
        priyanka.setRoll_no(102);
        priyanka.setName("Priyanka Mishra");
        System.out.println(priyanka.getRoll_no());
        System.out.println(priyanka.getName());
        System.out.println(priyanka.getDepartment());


    }
}
