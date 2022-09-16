import java.io.*;

class Student implements Serializable{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Student(){

    }
    public Student(int r,String n,float a, String d){
        rollno = r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString(){
        return "\nStudent Details\n"+
                "\nRoll" +rollno+
                "\nName" +name+
                "\nAverage" +avg+
                "\nDept" +dept+
                "\nData" +Data+
                "\nDept" +t+"\n";
                
    }

}


public class ObjectDemo {

    public static void main(String[] args) throws Exception{
        

    
    FileInputStream fos = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi5.txt");
    ObjectInputStream oos = new ObjectInputStream(fos);

    Student s=(Student)oos.readObject();
    
    System.out.println(s);
    

    fos.close();
    oos.close();

    /* 
        public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi5.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s=new Student(10, "Joni", 89.9f, "CSE");
        oos.writeObject(s);

        fos.close();
        oos.close(); */
}
}