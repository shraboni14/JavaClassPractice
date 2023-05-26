interface LibraryUser{ // Creating interface
    void registerAccount(); // Creating Abstract method
    void requestBook();  // // Creating Abstract method
}
class KidUsers implements LibraryUser{ // Creating a class by implementing interface.
    int age; // instance variable
    String bookType; // instance variable
    public  KidUsers(int age, String bookType){ // setting value by using constructor
        this.age = age;
        this.bookType = bookType;
    }
    @Override
    public void registerAccount() { // implementing abstract method
        if (this.age<12){
            System.out.println("You are successfully register under kid account");
        }else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    @Override
    public void requestBook() { // implementing abstract method
        if(this.bookType.equals("kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else {
            System.out.println("Oops, you are allowed to take only kids books”");
        }
    }
}
class AdultUser implements LibraryUser{ // Creating a class by implementing interface.
    int age;  // instance variable
    String bookType;  // instance variable
    public AdultUser(int age, String bookType){ // setting value by using constructor
        this.age = age;
        this.bookType = bookType;
    }
    @Override
    public void registerAccount() { // implementing abstract method
        if (this.age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult”");
        }
    }
    @Override
    public void requestBook() { // implementing abstract method
        if(this.bookType.equals("Fiction”")){
            System.out.println("“Book Issued successfully, please return the book within 7 days”");
        }
        else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
public class InterfaceProblem {
    public static void main(String[] args) {
//        1st part of the 1st testcase
        KidUsers k1 = new KidUsers(10,"kids");
        k1.requestBook();
        k1.requestBook();

//        2nd part of the 1st testcase
        KidUsers k2 = new KidUsers(18,"fiction");
        k2.registerAccount();
        k2.requestBook();

//        1st part of the 2nd testcase
        AdultUser a1 = new AdultUser(5, "kids");
        a1.registerAccount();
        a1.requestBook();

//        2nd part of the 2st testcase
        AdultUser a2 = new AdultUser(23, "fiction");
        a2.registerAccount();
        a2.requestBook();
    }
}
