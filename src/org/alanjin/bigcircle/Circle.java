package org.alanjin.bigcircle;

public class Circle {
    private Point center;
    private double radius;
    
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        if (radius <= 0) {
            System.err.println("radius is less and equal to 0");
            System.exit(-1);
        }
    }
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public boolean inThisCircle(Point a) {
        if (radius < Axis.getDistance(center, a)) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public String toString() {
        return "Circle [center=" + center + ", radius=" + radius + "]";
    }
}
