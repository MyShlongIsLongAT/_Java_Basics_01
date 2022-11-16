package at.florian.oo.basics.geometric_shapes_figures;

public class Square extends BaseShapeFigure{
    private double length;

    public Square(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public double getSurfaceArea() {
        return Math.pow(this.length,2);
    }
}
