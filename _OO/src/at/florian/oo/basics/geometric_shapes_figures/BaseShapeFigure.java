package at.florian.oo.basics.geometric_shapes_figures;

public class BaseShapeFigure {
    private String name;

    public BaseShapeFigure(String name) {
        this.name = name;
    }

    public double getSurfaceArea() {
        return 0;
    }

    public String getName() {
        return this.name;
    }
}
