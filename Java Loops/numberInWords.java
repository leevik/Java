import java.util.*;

class numberInWords{

    void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int r;
        String str = "";

        while (n>0) {
            r=n%10;
            n=n/10;
            str=str+r;
        }
        sc.close();
        System.out.println(str);
        char c;
        for(int i=str.length()-1; i>=0; i--){
            c=str.charAt(i);
            switch(c)
            {
                case '0':
                System.out.print("zero ");
                break;
                case '1':
                System.out.print("One ");
                break;
                case '2':
                System.out.print("Two ");
                break;
                case '3':
                System.out.print("Three ");
                break;
                case '4':
                System.out.print("Four ");
                break;
                case '5':
                System.out.println("Five ");
                break;
                default:
                System.out.print("Use only numbers between 0-5");
            }
        }
    }

    public static void main(String[] args) {
     numberInWords x = new numberInWords();
     x.reverseString();
    }
}
