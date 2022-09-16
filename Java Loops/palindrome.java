import java.util.*;

class palindrome {

    void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int r;
        int m=0;
        int z = n;
        while(n>0){
            r=n%10;                           //255 --> 5 ----- 2.loop -----> 25 ---> 5 ---------
            r=m*10+r;                           //5*10+5 ---> 55 ------ 2.loop ----> 55*10+2 = 552
            m=r;                               //55  ----------- 2. loop --->
            n=n/10;                             //25 ------- 2 --- 0
            System.out.println("  n is =  "+ n);
            System.out.println("r is = " + m);
        }
        sc.close();
        if(z == m) {
            System.out.println("Number is palindrome");
        }
        else 
        System.out.println("number is not a palindrome");
    }


    public static void main(String[] args) {
        palindrome x = new palindrome();
        x.reverse();
    }
}