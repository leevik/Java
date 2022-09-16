import java.io.*;

public class StudentChallenge {
    
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/source2.txt");
        //FileInputStream fis3 = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi.txt");
        FileOutputStream fos = new FileOutputStream("Destinations.txt");

        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        int x;
        while((x=sis.read())!=-1){

            fos.write((char)x);
        }

        sis.close();
        fis.close();
        fis2.close();
        //fis3.close();
        fos.close();

    }
        

}
