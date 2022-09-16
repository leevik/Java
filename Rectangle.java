public class Rectangle {
    public int length;
    public int breadth;

    public int area(){
        return breadth * length;
    }
    public int perimeter(){
        return 2*breadth + 2*length;
    }
    public boolean isSquare(){
        return length==breadth;
        }
}
