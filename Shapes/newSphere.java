import java.util.*;
class Sphere implements ThreeD{
    int rad;
    Sphere(int rad) {
        this.rad = rad;
    }
    @Override 
    public double SurfaceArea() {
        return 4* 3.14 * this.rad* this.rad;
    }
    @Override 
    public double Volume() {
        return 1.67* 3.14 *Math.pow(this.rad, 3);
    }
    @Override 
    public void execute() {
        System.out.printf("Surface area: ", SurfaceArea());
        System.out.printf("Volume: ", Volume());
    }
    @Override 
    public double TotalSurfaceArea() {
        return 0;
    }
    @Override 
    public double LengthofDiagonal() {
        return 0;
    }
    @Override 
    public double LateralSurfaceArea() {
        return 0;
    }
    @Override 
    public double CurvedSurfaceArea() {
        return 0;
    }
};

public class newSphere extends Sphere{
    int rad;
    newSphere(int rad) {
        super(rad);
    }
    
    @Override
    public void execute() {
        System.out.printf("Surface area: ", SurfaceArea());
        System.out.printf("Volume: ", Volume());
    }
}
