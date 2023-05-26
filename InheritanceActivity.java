class Employee1{
    // Creating all instance variable
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;
    // Setting value by using the constructor
    public Employee1(long id, String name, String address, long phone, double salary ){
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeePhone = phone;
        basicSalary = salary;
    }
//    This method is responsible to calculate the salary
    double calculateSalary(){
        double salary;
        salary = basicSalary + (basicSalary * specialAllowance/100)  + (basicSalary * hra/100);
        return salary;
    }
//    This method is responsible to calculate the Transport Allowance
    double calculateTransportAllowance(){ // Method for calculate transport allowance
        double transportAllowance =  this.basicSalary * 10/100;
        return transportAllowance;
    }
}
class Manager extends Employee1{ // Class Manager Inherit Parent class Employee1

    public Manager(long id, String name, String address, long phone, double salary) { // Invoking supper constructor
        super(id, name, address, phone, salary);
    }
    @Override
    double calculateTransportAllowance() {  // Overriding Method for calculate transport allowance
        double transportAllowance = 15*basicSalary /100;
        return transportAllowance;
    }
}
class Trainee extends Employee1{    // Class Trainee Inherit Parent class Employee1

    public Trainee(long id, String name, String address, long phone, double salary) {
        super(id, name, address, phone, salary);
    }

}
public class InheritanceActivity {
    public static void main(String[] args) {

        Manager m =new Manager(126534,"Peter","Chennai India",237844,65000);
//        Printing information of Manager
        System.out.println("Manager Salary is - "+ m.calculateSalary());
        System.out.println("Manager Transport allowance is - " + m.calculateTransportAllowance());
        Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
//        Printing information of Trainee
        System.out.println("Trainee Salary is - "+ t.calculateSalary());
        System.out.println("Trainee Transport allowance is - " + t.calculateTransportAllowance());
    }
}
