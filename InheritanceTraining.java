class account{
public String accno;
public String name;
public String address;
public String phonenumber;
public long balance;

    public String getAccno() {
        return accno;
    }
    public String getName() {
        return name;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance =+ balance;
    }

    public account(String accnumber, String Name, String Address, String Phonenumber){
        accno = accnumber;
        name = Name;
        address = Address;
        phonenumber = Phonenumber;
    }
    
}
class LoanAccount extends account{

    public void payEms(){

    }
    public void topuploan(){

    }
    public void repayment(){

    }

}
class SavingsAccount extends account{
    public long depositAmount;

    public void deposit(){
        setBalance(depositAmount);
    }
    public void withdraw(){

    }
    public void fixedDeposit(){

    }
    public void liquidate(){

    }
}
public class InheritanceTraining {

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

      System.out.println("aha" + s.getBalance());
    }
    
}