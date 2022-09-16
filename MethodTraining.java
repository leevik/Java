public class MethodTraining {

    boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age){
        return age>=3 && age<=15;
    }


    int reverse(int n){
        int r=0;
        while(n>0){
           r=r*10+n%10;
           n=n/10;
        }
        return r;
    }

    int [] reverse(int A[]){
        int B[] = new int[4];
        for(int i=A.length-1, j=0; i>=0; i--, j++){
           B[j] = A[i];
        }
        return B;
    }

    int findMax(int ...A){
        if(A.length == 0)return Integer.MIN_VALUE;
        int max = A[0];
        for(int i=1; i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println(max);
        return max;
    }
    int sum(int ...A){
        if(A.length==0)return Integer.MIN_VALUE;
        int j=0;
        for(int x:A){
            j += x;
        }
        System.out.println(j);
        return j;
    }

    double discount(double ...P){
        double sum=0;
        for(int i =0; i < P.length; i++){
            sum+=P[i];
        }
        System.out.println(sum*0.4);
        return sum/0.4;
    }

    public static void main(String[] args) {
       /*  int A[] = {1,3,5,7};
        MethodTraining x = new MethodTraining(); */
        double s = 0;
       // x.reverse(A);
       //System.out.println(x.reverse(1234));
      /* System.out.println(x.validate(2)); */
      /* x.findMax(10,12,30,21,62,33,123,2,111); */
      /* x.sum(1,2,3,4,5,6,7,8); */
      /* x.discount(100); */
      for(String d:args){
          if(d.matches("[0-9\\.]+"))
          s = s + Double.parseDouble(d);
      }
      System.out.println(s);
    }
}
