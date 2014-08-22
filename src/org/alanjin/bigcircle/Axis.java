package org.alanjin.bigcircle;
import java.util.ArrayList;
import java.util.List;

public class Axis {
    private final ArrayList<Point> points;
    
    public Axis(Point... points) {
        this.points = new ArrayList<Point>();
        for (Point point : points) {
            this.points.add(point);
            System.out.println("Input: " + point);
        }
    }
    
    public ArrayList<Point> getAllPoints() {
        return points;
    }
    
    public static double getDistance(Point a, Point b) {
       return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
    }
    
    public Point findCenter(Point a, Point b) {
        double x = Math.abs(a.getX() + b.getX())/2;
        double y = Math.abs(a.getY() + b.getY())/2;
        return new Point(x, y);
    }
    
    public Circle findBigCircle() {
        List<Point> allPoints = getAllPoints();
        for (int i = 0; i < allPoints.size(); i++) {
            Point hereWeAre = allPoints.get(i);
            for (int j = i + 1; j < allPoints.size(); j++) {
                Point otherPoint = allPoints.get(j);
                Point centerPoint = findCenter(hereWeAre, otherPoint);
                Circle circle = new Circle(centerPoint, Axis.getDistance(hereWeAre, centerPoint));
                boolean allIn = true;
                for (int k = i + 1; k < allPoints.size(); k++) {
                    if (!circle.inThisCircle(allPoints.get(k))) {
                        System.out.println(allPoints.get(k) + " is out the circle " + circle);
                        allIn = false;
                        break;
                    }
                }
                if (allIn) {
                    System.out.println("Find! It pass through " + hereWeAre + " and " + otherPoint);
                    return circle;
                }
            }
        }
        return null;
    }
}
