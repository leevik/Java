import java.io.*;

class Customer implements Serializable {
    String custID;
    String name;
    String phno;
    
    static int count=1;


    public Customer(){

    }

    public Customer(String n, String p){
        custID = "c"+count;
        count++;
        name=n;
        phno=p;
    }

    public String toString(){
        return "\nCustomer Details\n"+
                "\nCustomer ID " +custID+
                "\nName " +name+
                "\nPhone number" +phno;
                
    }
}



public class StudentChallenge3 {


    public static void main(String[] args) throws Exception {
        
       /*  FileOutputStream fos = new FileOutputStream("C:/Users/Leevi/Desktop/java/IO_streams/asiakaslista");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Customer c[] = {new Customer("joni","0400595123"),new Customer("jani","0400592323"),new Customer("jonne","023232322")};

        oos.writeInt(c.length);
        for(Customer x:c){
            oos.writeObject(x);
        }

        oos.close();
        fos.close(); */



        FileInputStream fis = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/asiakaslista");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        Customer list[]= new Customer[length];

        for(int i=0;i<length;i++){
            list[i]=(Customer)ois.readObject();
        }
        for(Customer x:list){
            System.out.println(x);
        }

        /* 
         * 
         * nimellä ettiminen
         */
        
         /* 
         *java.util.Scanner sc = new java.util.Scanner(System.in);
         * System.out.println("Enter name of customer");
         * String name=sc.nextLine();
         * 
         * for(int i=0;i<length;i++){
         * if(name.equalsIgnoreCase(list[i].name))
         * System.out.println(list[i]);
         * }
         * 
         */
       

        ois.close();
        fis.close();


        
    }
    
}
