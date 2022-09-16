public class Cylinder {
    public double radius;
    public double height;


    public double lidArea(){
            return Math.PI*radius*radius;
    }

    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }

    public double volume(){
        return lidArea()*height;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }
}
