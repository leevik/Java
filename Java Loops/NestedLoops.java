public class NestedLoops {


  void nestLoops(){
      for(int i=0; i <=5;i++){

        for(int j=0; j<=5; j++){
            System.out.print("("+ i + "," + j +")");
        }
        System.out.println("");
      }
  }

  void pattern(){
      int count =0;
      for(int i=1; i <=5;i++)
        {
        for(int j=1; j<=5; j++)
            {
                System.out.format("%02d ", ++count);
            }
        System.out.println("");
        }
    }

    void pattern2(){
       /*  int count = 0; */
        for(int i=5; i >0;i--)
        {
        for(int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
        System.out.println("");
        }
    }
    
    void pattern3(){
        /* int count = 0; */
        for(int i=5; i>0 ;i--)
        {
        for(int j=0; j<=5; j++)
            {
                if(j>=i){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        for(int x=5; x>0; x--){
            if(x>i){
                System.out.print("*");
            }
            else
            System.out.print(" ");
        }
        System.out.println("");
        }

        for(int i=5; i>0 ;i--)
        {
        for(int j=5; j>0; j--)
            {
                if(j<i){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
        for(int x=1; x<5; x++){
            if(x<i-1){
                System.out.print("*");
            }
            else
            System.out.print(" ");
             }
        System.out.println("");
        }
        }

    public static void main(String[] args) {
        NestedLoops x = new NestedLoops();
        //x.pattern();
        //x.pattern2();
        x.pattern3();
    }
    
}
