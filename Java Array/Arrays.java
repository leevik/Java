import java.util.Scanner;

public class Arrays {
    

    void arrayloop(){
        int A[] = {1,2,3,4,5};
/*         int B[] = new int[10]; */

        for(int x : A){
            System.out.println(++x);
        }
    }

    int sumElements(){
        int A[] = {1,3,5,7,8,13};
        int i=0;

        for(int x : A){
            i+=x;
        }
        return i;
    }

    void searchElement(){
        int A[] = {1,2,3,4,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int key = sc.nextInt();
        sc.close();
        int i = 0;

        for(int x : A){
            i++;
            if(x == key){
                i--;
                System.out.println("number u searched for was: " + i + "th element in an array");
                System.exit(0);
            }
        }
        
            System.out.println("No key in array found");
    }
    
    void findMax(){
        int A[] = {1,2,3,4,7,8,9,62,13,77,14,18};
        int i = 0;
        for(int x : A){
            if(x>i){
                i=x;
            }
        }
        System.out.println(i);
    }
    void findSecondMax(){
        int A[] = {1,2,3,4,7,8,9,62,13,77,14,18};
        int i = 0;
        int j = 0;

        for(int x : A){
            if(x>i){
                j=i;
                i=x;
            }
        }
        System.out.println(j);
    }

    void leftArrayRotation(){
        int A[] = {1,2,3,4,5,6,7,8};
        int i = 0;
        int x = A[0];
        for(i=1; i<A.length; i++){
            A[i-1] = A[i];
        }
        A[A.length-1] = x;

        for(int z : A){
            System.out.print(z+",");
        }
    }

    void rightArrayRotation(){
        int A[] = {1,3,5,8,11};
        int i = 0;
        int x = A[A.length-1];
        for(i=A.length-1; i>0 ;i--){
            A[i] = A[i-1];
        }
        A[0] = x;
        for(int z : A){
            System.out.print(z+",");
        }
    }

    void insertIntoArray(){
        int A[]  = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int i = 0;
        int key = 2;
        int x = 15;

        for(i=A.length-1; i>key ;i--){
            A[i] = A[i-1];
        }
        A[key] = x;

        for(int j : A){
            System.out.print(j +",");
        }
    }

    void deleteFromArray(){
        int A[]  = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;
        int i = 0;
        int key = 1;


        for(i=0; i<A.length;i++){
            if(i == key){
                for(int j=i; j<A.length-1; j++){
                    A[j] = A[j+1];
                }
            }
        }
        for(int z: A){
            System.out.print(z + ",");
        }
        System.out.println(A.length);
    }

    void copyingArray(){
        int A[] = {1,2,3,4,5,8,9};
        int B[] = new int[7];

        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }
        for(int x : B){
            System.out.print(x);
        }

    }
    
    void reverseCopyArray(){
        int A[] = {1,2,3,4,5,8,9};
        int B[] = new int[7];

        for(int i=A.length-1, j=0; i>=0; i--, j++){
            System.out.println(i+"th round" +A[i]);
            B[j] = A[i];
        }
        for(int x : B){
            System.out.print(x);
        }
    }

    void increaseArray(){
        int A[] = {1,2,3,4,5};
        int B[] = new int[2*A.length];
        
        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }
        A=B;
        B=null;
        System.out.println(B);
        System.out.println(A.length);
    }

    void twoDArraySum(){

        /* int A[][] = new int [5] [5];
        int B[][]= {{1,2,3},{2,4,6},{1,3,5}};
        int C[][];
        C = new int[5][5];
        int [][]D= new int[5][5]; */

        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
              C[i][j] =  (A[i][j] + B[i][j]);
            }
        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }

    void twoDArrayMultiplication(){
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                
             for(int k=0;k<A[j].length;k++){
                 System.out.println(i+" i:th loop, "+j +" j:th loop, "+ k+ " k:th loop");
                 C[i][j] = C[i][j]+ A[i][k]*B[k][j];
             }
            }
        }
        for(int x[]:C){
            for(int y:x){
                System.out.print(y + " ");
            }
            System.out.println("");
        }
    }
    

    
    public static void main(String[] args) {
        Arrays x = new Arrays();
       /*  x.arrayloop();
       System.out.println(x.sumElements());
       x.searchElement();
       x.findMax();
       x.findSecondMax();
       x.leftArrayRotation();
       x.rightArrayRotation();
       x.insertIntoArray();
       x.deleteFromArray();
       x.copyingArray();
       x.reverseCopyArray();
       x.increaseArray();
       x.twoDArraySum(); */
       x.twoDArrayMultiplication();
    }
}
