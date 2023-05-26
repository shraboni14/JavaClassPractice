
class Bank{
    int accountNo;
    String accountHolderName;
    double balance;
    public void setdatabank(int acc_no, String name, double blnc){
        accountNo = acc_no;
        accountHolderName = name;
        balance = blnc;
    }
    public void withdrawl(double amount){
        if (balance > amount) {
            System.out.println("Withdrawn: " + amount);
            balance -= amount;
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class Bank_problem {
    public static void main(String[] args) {
        Bank ICICI = new Bank();

        ICICI.setdatabank(101,"shraboni",10000);
        ICICI.withdrawl(1000);
    }
}
