import java.io.*;


class Student{
    String name;
    int rollno;
    String dept;
}
public class PrintStreamDemo {
    

    public static void main(String[] args) throws Exception {

        /* 
         * 
         * testi.txt tiedostosta lukemiseen
         */
        FileInputStream fis = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi.txt");
        BufferedReader br  = new BufferedReader(new InputStreamReader(fis));

        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept  = br.readLine();

        System.out.println("Roll No " + s.rollno);
        System.out.println("Name "+ s.name);
        System.out.println("Dept "+s.dept);

        /* 
         * 
         * testi.txt tiedostoon kirjoittamiseen
         */
       /*  FileOutputStream fos = new FileOutputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi.txt");
        PrintStream ps = new PrintStream(fos);
        Student s=new Student();
        s.rollno=10;
        s.name="John";
        s.dept="CSE";

        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close(); */
        

        
    }
}
