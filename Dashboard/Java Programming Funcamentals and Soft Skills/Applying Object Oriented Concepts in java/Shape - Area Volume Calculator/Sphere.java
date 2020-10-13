public class Sphere extends Shape implements Spatial {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 * Math.PI * radius * radius * radius) / 3;
    }
}
