package org.alanjin.bigcircle;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
