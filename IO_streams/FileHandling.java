import java.io.*;


public class FileHandling {
    
    public static void main(String[] args) throws Exception {
        File f= new File("C:/Users/Leevi/Desktop/java/IO_streams");

       // f.setReadOnly();
        f.setWritable(true);
        FileOutputStream fos = new FileOutputStream("C:/Users/Leevi/Desktop/java/IO_streams");


        System.out.println(f.isDirectory());

        File list[] = f.listFiles();
        for(File x:list){
            System.out.println(x.getName()+ "");
            System.out.println(x.getPath());
        }
    }
}
