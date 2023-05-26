
class Employee{
    private String name;
    private int monthlySalary;
    private int age;

    public Employee(String name, int monthlySalary, int age){
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
    }
    void getdata(){
        System.out.println("Name : "+name+ " Monthly Salary : "+monthlySalary + " Age : "+age);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
}
class EmployeeBusinessLogic{
    double calculateYearlySalary(Employee emp1){
        return emp1.getMonthlySalary()*12;
    }
    double calculateAppraisal(Employee emp1){
        double appraisal = 0;
        if (emp1.getMonthlySalary()<10000){
            appraisal = 500;
        }else {
            appraisal=1000;
        }
        return appraisal;
    }
}
public class Employee_problem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Shraboni",20000,27);
        EmployeeBusinessLogic eb = new EmployeeBusinessLogic();
        System.out.println("Employee's annual salary is : " + eb.calculateYearlySalary(emp1));
        System.out.println("Appraisal amount is :" + eb.calculateAppraisal(emp1));
        emp1.getdata();
    }
}
