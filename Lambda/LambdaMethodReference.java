
interface MyLambda{
    public void display(String str);
}


public class LambdaMethodReference {

    public LambdaMethodReference(String x){
        System.out.println(x.toUpperCase());
    }
    //2.
   /*  public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb); */
    
    public static void main(String[] args) {
       // MyLambda ml = System.out::println;    //1. perus metodin kiinnitys
       
       //2.staattisen metodin kiinnitys
       /* MyLambda ml=LambdaMethodReference::reverse;
       ml.display("hahaa"); */

       //konstruktorin käyttö lambdalla
       MyLambda ml = LambdaMethodReference::new;

       ml.display("jaaajoo");
    }
    }

