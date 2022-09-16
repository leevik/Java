import java.io.*;

class Consumer extends Thread{

    InputStream is;

    public Consumer(InputStream s){
        is=s;
    }
    public void run(){
        int x;
        while(true){
            try{
                x=is.read();

                System.out.println("Consumer " + x);
                System.out.flush();
                x++;
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }


}
class Producer extends Thread{

    OutputStream os;

    public Producer(OutputStream o){
        os=o;
    }
    public void run(){
        int count=1;
        while(true){
            try{
                os.write(count);

                System.out.println("Producer " + count);
                System.out.flush();
                count++;
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }


}






public class PipedDemo {
    

    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
