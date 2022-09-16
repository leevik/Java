


class MyThread implements Runnable {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class ThreadTest{
    /* public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    } */
    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread t = new Thread(my);
        t.start();

        //ThreadTest my = new ThreadTest();

        

        int i=1;
        while(true){
            System.out.println(i+ " world");
            i++;
        }
    }
    
}
/* class MyThread extends Thread {

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class ThreadTest extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
    public static void main(String[] args) {
       // MyThread my = new MyThread();
        ThreadTest my = new ThreadTest();
        my.start();

        int i=1;
        while(true){
            System.out.println(i+ " world");
            i++;
        }
    }
    
} */