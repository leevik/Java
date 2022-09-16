
class MyData{
    int value;
    boolean flag= true;
    synchronized public void set(int v){
        while(flag!=true)
           try{ wait();}catch(Exception e){}
        value = v;
        flag=false;
        notify();
    }
    synchronized  public int get(){
        int x = 0;
        while(flag=true)
        try {
            wait();
        } catch (Exception e) {
            
        }
        x = value;
        flag=true;
        notify();
        return x;
    }
   
}
class Producer extends Thread{
    MyData data;

    public Producer(MyData d){
        data = d;
    }
    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("Producer "+ count);
            count++;
        }
    }
}
class Consumer extends Thread{
    MyData data;

    public Consumer(MyData d){
        data = d;
    }
    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class InterProcess {
    public static void main(String[] args) {
        MyData md = new MyData();

        Producer p = new Producer(md);
        Consumer c  = new Consumer(md);

        p.start();
        c.start();

    }
}
