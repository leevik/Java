
/* class MyRun implements Runnable{
    public void run(){}
} */

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
         setPriority(Thread.MAX_PRIORITY); 
    }
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ + "My Thread");
            /* try{
            Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            } */
        }
    }
}

public class ThreadTest2 {
        //Yield antaa aikaa muille säikeille enemmän
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread");
        t.start();

        int count=1;
        while(true){
            System.out.println(count++ + "Main");
            Thread.yield();
        }
        //alempana testailua, kuinka daemonthread lakkaa toimimasta heti kun main thread lakkasi toimimasta.
        // mainThread.join metodilla saatiin daemonthreadin ikuinen looppi käyntiin
        /* t.setDaemon(true);

        System.out.println("ID" + t.getId());
        System.out.println("Name " + t.getName());
        System.out.println("Priority " + t.getPriority());
        t.start();

        Thread mainThread = Thread.currentThread();
        mainThread.join();
        System.out.println("State " + t.getState());
        t.interrupt();
        System.out.println("Alive " + t.isAlive()); */

        /* Thread t = new Thread(new MyRun(),"My Name"); */ // MyRun luokan kans
    }
}
