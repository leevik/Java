class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a rectangle cannot be negative";
    }
}

public class ThrowThrowsDemo {



    static int meth1() throws ArithmeticException{
        return 10/0;
    }


    static void meth2() throws ArithmeticException{
        meth1();
    }
    static void meth3(){
        try {
            meth2();
        } catch (ArithmeticException e) {
            System.out.println(e.toString()+ " daaaamnn");
        }
        
    }

    static int area(int l, int b) throws NegativeDimensionException{
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void areaMeth()throws NegativeDimensionException{
        System.out.println(area(-10, 5));
    }




    public static void main(String[] args) {
        meth3();
        try{
        areaMeth();
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
    }
    
}
