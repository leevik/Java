
class Customer extends Thread{

    ATM atm;
    String name;
    int amount;

    Customer(String n, ATM a, int am){
        name = n;
        atm = a;
        amount = am;
    }

    void useATM(){

        atm.checkbalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }

}

class ATM {
  synchronized  public void checkbalance(String name){
        System.out.println("hello: " +name);

        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(" nice to meet you");
    }
   synchronized public void withdraw(String name, int amount){
        System.out.println(name + " withdrawing: " + amount);
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(" withdraw completed");
    }
}


public class ATMMachine {
    
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("leevi",atm, 23);
    Customer c2 = new Customer("kalle",atm, 5555);
        c1.start();
        c2.start();


    }
}
