
interface Member{
    void callback();
}

class store {
    Member mem[] = new Member[10];
    int count = 0;

    void register(Member m){
        mem[count++] = m;
    }

    void inviteSale(){
        for (int i=0; i<count;i++){
            mem[i].callback();
        }
    }
}

class Customer implements Member{

        String name;
        Customer(String n){
            name = n;
        }

        public void callback(){
            System.out.println("Ok I will visit " + name);
        }
}



public class InterfaceMember {
    public static void main(String[] args) {
        store s = new store();
        Customer c1 = new Customer("john");
        Customer c2 = new Customer("leevi");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
