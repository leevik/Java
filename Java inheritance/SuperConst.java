class Parent{
    Parent()
    {
        System.out.println("Ei parametrisoitu vanhempi");
    }
    Parent(int x){
        System.out.println("Parametrisoitu vanhempi" + x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Ei parametrisoitu lapsi");
    }

    Child(int y){
        System.out.println("parametrisoitu lapsi" + y);
    }
    Child(int x, int y){
        super(x);
        System.out.println("2 parametrin lapsi" + x + y);
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("ei parametrisoitu lapsenlapsi");
    }
    GrandChild(int z){
        System.out.println("Parametrisoitu lapsenlapsi");
    }
    GrandChild(int x, int y, int z){
        super(x, y);
        System.out.println("3 parametrin lapsenlapsi" + x + y +z);
    }
}



public class SuperConst{

    public static void main(String[] args) {

        GrandChild g= new GrandChild(2,3,4);
    }

}