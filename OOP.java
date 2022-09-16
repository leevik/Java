public class OOP {
    private int height;
    private double radius;
    private double dimension;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int H){
        height = H;
    }
    public void setDimensions(int H, double r){
        dimension = H *r;
    }
    public double getDimensions(){
        return dimension;
    }


    public static void main(String[] args) {
        OOP oop = new OOP();
        oop.setHeight(5);
        System.out.println(oop.getHeight());
        oop.setRadius(2.2);
        System.out.println(oop.getRadius());
        oop.setDimensions(5, 2.3);
        System.out.println(oop.getDimensions());
    }
}
