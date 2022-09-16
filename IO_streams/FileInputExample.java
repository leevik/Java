import java.io.*;

public class FileInputExample{
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi3.txt");

        byte b[] = new byte[fis.available()];
        fis.read(b);

        String str = new String(b);

        System.out.println(str);

    }
}