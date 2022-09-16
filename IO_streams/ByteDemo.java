import java.io.*;

public class ByteDemo {

    public static void main(String[] args) {
        char c[] = { 'a', 'b', 'c', 'd', 'e', 'f' };

        CharArrayReader cr = new CharArrayReader(c);

        int x;
        try {
            while ((x = cr.read()) != -1) {
                System.out.println(x);                   //ascii arvot tulostuu a = 97, b = 98 etc... mut jos haluaa a tulostaa a pitää typecastaa sysout(char(x))
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
