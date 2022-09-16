//1.
/* interface MyLambda{
    public int add(int x, int y);
} */   
interface MyLambda{
    public void display();
}          

class Demo{
    public void method1(){
        //2.
       /*  MyLambda ml = () ->{
            int jaajo = 5;
            System.out.println("Hi");
            System.out.println("terve"+ jaajo);
        };
        ml.display(); */

        UseLambda ul = new UseLambda();
        ul.callLambda(()->{System.out.println("terve");});
    }
}


class UseLambda {
    public void callLambda(MyLambda ml){
        ml.display();
    }
}

public class Lambda{

    public static void main(String[] args) {

        Demo d = new Demo();
        d.method1();
        
        /* MyLambda m = (a,b) -> a+b;
        int r = m.add(22,33);
        System.out.println(r); */      //1.
    }
}