package at.florian.oo.basics.geometric_shapes_figures;

public class Cube extends Square{
    public Cube(String name, double length) {
        super(name, length);
    }

    @Override
    public double getSurfaceArea() {
        return super.getSurfaceArea()*6;
    }
}
