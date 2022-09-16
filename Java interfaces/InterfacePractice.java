

interface Test {
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    default void meth4(){
        System.out.println("Meth 4 of test");
    }
    static void meth3(){
        System.out.println("Meth3 of test");
    }
}
interface Test2 extends Test{                          //interface voi extendaa interfacee
    void meth5();
}

class My implements Test {
   public void meth1(){
        System.out.println("meth 1");
    }
   public void meth2(){
        System.out.println("meth 2");
    }
}
class MyTest implements Test2{
    public void meth1(){}
    public void meth2(){}
    public void meth3(){}
    public void meth4(){}
    public void meth5(){}
}


public class InterfacePractice{

    public static void main(String[] args) {
        MyTest m = new MyTest();
        m.meth4();
        /* System.out.println(Test.X);                  //interfacessa on static nii silloin voi kutsua ilman että tekee olion.
        Test.meth3();                                // ^^
        Test t = new My();
            t.meth1();
            t.meth2(); */
    }
}