package at.florian.oo.basics.geometric_shapes_figures;

public class Circle extends BaseShapeFigure {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return (Math.pow(radius, 2) * Math.PI) / 2;
    }
}
