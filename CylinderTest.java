public class CylinderTest {
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder();
        c1.height = 10;
        c1.radius = 7;


        System.out.println("Lid Area " + c1.lidArea());
        System.out.println("Total surface area " + c1.totalSurfaceArea());
        System.out.println("Volume " + c1.volume());
        
    }
}
