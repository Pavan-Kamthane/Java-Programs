class Cylinder implements ThreeD{
    int radi;
    int heig;
    Cylinder(int radi, int heig) {
        this.radi= radi;
        this.heig= heig;
    }
    @Override 
    public double TotalSurfaceArea() {
        return 2*3.14*this.radi* (this.heig + this.radi);
    }
    @Override 
    public double CurvedSurfaceArea() {
        return 2*3.14* this.radi*this.heig;
    }
    @Override 
    public double Volume() {
        return 3.14* this.radi*this.radi*this.heig;
    }
    @Override 
    public void execute() {
        System.out.printf("Total Surface area: ", this.TotalSurfaceArea());
        System.out.printf("Curved Surface area: ", this.CurvedSurfaceArea());
        System.out.printf("Volume: ", this.Volume());
    }
    
    @Override 
    public double LateralSurfaceArea() {
        return 0;
    }
    @Override 
    public double LengthofDiagonal() {
        return 0;
    }
    @Override 
    public double SurfaceArea() {
        return 0;
    }
};
public class newCylinder extends Cylinder{
    newCylinder(int radi, int heig) {
        super(radi, heig);
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: ", TotalSurfaceArea());
        System.out.printf("Curved Surface area: ", CurvedSurfaceArea());
        System.out.printf("Volume: ", Volume());
    }
}
