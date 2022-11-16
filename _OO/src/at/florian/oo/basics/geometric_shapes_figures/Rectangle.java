package at.florian.oo.basics.geometric_shapes_figures;

public class Rectangle extends BaseShapeFigure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSurfaceArea() {
        return this.length * this.width;
    }
}
