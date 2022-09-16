import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n=scan.nextInt();
        scan.close();

        int m=n;
        int sum=0;
        int remainder;
        while(n>0){
            remainder=n%10;
            n=n/10;

            sum=sum+remainder*remainder*remainder;
        }
            if(sum==m){
                System.out.println("Its a armstrong number");
            }
            else 
            System.out.println("Its not a armstrong number");
            

    }
    
}
