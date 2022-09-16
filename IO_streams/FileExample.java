import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample{
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("C:/Users/Leevi/Desktop/java/IO_streams/testi3.txt");
        String str="Opi java ohjelmointia";

        byte b[]=str.getBytes();
        fos.write(b, 4, str.length()-4);
        //fos.write(str.getBytes());

        fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}