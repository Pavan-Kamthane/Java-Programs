class Cube implements ThreeD{
    int side;
    Cube(int side) {
        this.side= side;
    }
    @Override
    public double TotalSurfaceArea() {
        return 6*side*side;
    }
    @Override
    public double LateralSurfaceArea() {
        return 4*side*side;
    }
    @Override
    public double Volume() {
        return Math.pow(side, 3);
    }
    @Override
    public double LengthofDiagonal() {
        return side* 1.73;
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", this.TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", this.LateralSurfaceArea());
        System.out.printf("Volume: %.2f\n", this.Volume());
        System.out.printf("Length of Diagonal: %.2f\n", this.LengthofDiagonal());
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

public class newCube extends Cube{
    int side;
    newCube(int side) {
        super(side);
    }
    @Override
    public void execute() {
        System.out.printf("Total Surface area: %.2f\n", TotalSurfaceArea());
        System.out.printf("Lateral Surface area: %.2f\n", LateralSurfaceArea());
        System.out.printf("Length of Diagonal: %.2f\n", LengthofDiagonal());
        System.out.printf("Volume: %.2f\n", Volume());
    }
}
