

class Data<T>{
    private T obj;

    public void asetaData(T v){     //setdata
        obj = v;
    }
    public T noudaData(){           //getdata
        return obj;
    }
}


class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int length=0;

    public void append(T v){
        A[length++]=v;                              //lisää v arvo A lengthinteen eli ekalla pyöräytyksellä 0 kohtaan ja sitten lisäyksen jälkeen kasvattaa lengthiä 1.
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(length+ " length");
            System.out.println(A[i]);
        }
    }
}

class MyArray2<T> extends MyArray<T>{ 

}

public class GenericDemo{

    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        show(new String[]{"Hi","terve"});

        Data<String> d = new Data<>();
        d.asetaData("hahah");
        System.out.println(d.noudaData());

        Data<Integer>i = new Data<>();
        i.asetaData(5555);
        System.out.println(i.noudaData());
        

        

        MyArray<Integer> ma = new MyArray<>();

        ma.append(10);
        ma.append(20);
        ma.append(3);

        ma.display();
        
    }
}