import java.io.*;

public class StudentChallenge2 {
    

    public static void main(String[] args) throws Exception {


        FileInputStream fis = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/data.txt");
        DataInputStream dis = new DataInputStream(fis);
        
        int length=dis.readInt();
        float data;

        for(int i=0;i<length;i++){
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
        


        


       /*  FileOutputStream fos = new FileOutputStream("C:/Users/Leevi/Desktop/java/IO_streams/data.txt");
        DataOutputStream ps = new DataOutputStream(fos);
        float list[] = {10.3f,2.9f,6.4f,3.7f};
        
        ps.writeInt(list.length);

        for(Float x:list){
           ps.writeFloat(x);
        }

        ps.close();
        fos.close(); */




    }
    
}
