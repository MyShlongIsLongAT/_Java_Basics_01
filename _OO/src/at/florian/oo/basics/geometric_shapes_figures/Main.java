package at.florian.oo.basics.geometric_shapes_figures;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle1",2.5);
        System.out.println(circle.getSurfaceArea());

        Cube cube = new Cube("Cube1",10);
        System.out.println(cube.getSurfaceArea());

        Rectangle rectangle = new Rectangle("Rectangle1",5,6);
        System.out.println(rectangle.getSurfaceArea());

        Square square = new Square("Square1",10);
        System.out.println(square.getSurfaceArea());
    }
}
