// public interface Shape {
//     double area();
//     double volume();
// }
// public class Circle implements Shape {
//     private double radius;

//     public Circle(double radius) {
//         this.radius = radius;
//     }
//     @Override
//     public double area() {
//         return 2 * 3.14 * radius;
//     }
//     @Override
//     public double volume() {
//         throw new UnsupportedOperationException();
//     }
// }
// public class Cube implements Shape {
//     private int edge;
//     public Cube(int edge) {
//         this.edge = edge;
//     }
//     @Override
//     public double area() {
//         return 6 * edge * edge;
//     }
//     @Override
//     public double volume() {
//         return edge * edge * edge;
//     }
// }

public interface ShapeArea {
    double area();
}

public interface ShapeVolume {
    double volume();
}

public class Circle implements ShapeArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}

public class Cube implements ShapeArea, ShapeVolume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}