public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.breadth = 5;
        r1.length = 6;

        System.out.println("area is "+r1.area());
        System.out.println("perimeter is "+r1.perimeter());
       System.out.println("is it square " +r1.isSquare());
    }
    
}
