class Outer{
   static int x = 10;
   /* Inner a = new Inner(); */

   static class Inner{
        int y= 20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay(){
        Outer.
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}



public class InnerClassPractice {

    public static void main(String[] args) {
       /* Outer.Inner i = new Outer().new Inner(); */
       Outer.Inner i = new Outer.Inner();
        i.innerDisplay();
        Outer o = new Outer();
        o.outerDisplay();
    }
    


}