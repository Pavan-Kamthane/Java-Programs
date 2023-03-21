class Cuboid implements ThreeD{
    int len;
    int brea;
    int hei;
    Cuboid(int len, int brea, int hei) {
        this.len = len;
        this.brea= brea;
        this.hei = hei;
    }
    @Override 
    public double TotalSurfaceArea() {
        return 2* (this.len*this.brea + this.brea*this.hei + this.hei*this.len);
    }
    @Override 
    public double LateralSurfaceArea() {
        return 2*(this.len + this.brea) *this.hei;
    }
    @Override 
    public double Volume() {
        return this.len*this.brea*this.hei;
    }
    @Override 
    public double LengthofDiagonal() {
        return Math.sqrt(Math.pow(this.len, 2) + Math.pow(this.brea, 2) + Math.pow(this.hei, 2));
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", this.TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", this.LateralSurfaceArea());
        System.out.printf("Length of Diagonal: %.2f\n", this.LengthofDiagonal());
        System.out.printf("Volume: %.2f\n", this.Volume());
    }
    @Override 
    public double SurfaceArea() {
        return 0;
    }
    
    @Override
    public double CurvedSurfaceArea() {
        return 0;
    }
};

public class newCuboid extends Cuboid{
    int len; 
    int brea; 
    int hei; 
    newCuboid(int len, int brea, int hei) {
        super(len, brea, hei);
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", LateralSurfaceArea());
        System.out.printf("Length of Diagonal: %.2f\n", LengthofDiagonal());
        System.out.printf("Volume: %.2f\n", Volume());        
    }
};