import java.util.Scanner;


public class fibonacci {

    void arithmeticSeries(){

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers in a sequence? ");
        int n = sc.nextInt();

        System.out.println("Enter first number :");
        int x = sc.nextInt();

        System.out.println("Enter second number: ");
        int c = sc.nextInt();
        sc.close();

        int difference = c-x;
        int helper = x;
    
        String str = "";
        str = str+x;
        while(n>0){
            System.out.print(helper + ",");
            helper=helper+difference;
            n--;
        }
    }
    void geometricProgression(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers in a sequence? ");
        int n = sc.nextInt();

        System.out.println("Enter first number :");
        int x = sc.nextInt();

        System.out.println("Enter second number: ");
        int c = sc.nextInt();
        sc.close();

        int difference = c/x;
        int helper = x;

        while(n>0){
            System.out.print(helper+ ",");
            helper=helper*difference;
            n--;
        }
    }

    void fib(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers in a sequence? ");
        int n = sc.nextInt();

        System.out.println("Enter first number :");
        int x = sc.nextInt();

        System.out.println("Enter second number: ");
        int c = sc.nextInt();
        int sum;
        sc.close();
        while(n>0){
            System.out.print(x + ",");
            sum=x+c;
            x=c;
            c=sum;
            n--;
        }

    }

    public static void main(String[] args) {
        fibonacci x = new fibonacci();
        //x.arithmeticSeries();
        //x.geometricProgression();
        x.fib();
        
    }
    
}
