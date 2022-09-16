import java.lang.reflect.Array;
import java.util.Scanner;


public class ExceptionDemo{
    
    public static void main(String[] args) {
        int a=10, b=2, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int d = sc.nextInt();
        int e  =sc.nextInt();
        
        try {
            int x  = d/e;
            System.out.println("First number u gave "+ d +" divided by second number "+ e +" is: " + x);

        } catch (Exception o) {
            System.out.println("Denominator should not be 0, try again!");
        }

        try {
            c=a/b;
            System.out.println(c);
        } catch (Exception o) {
            System.out.println("Denominator should not be 0, try again!");
        }
        
        System.out.println("Bye");
    }
}