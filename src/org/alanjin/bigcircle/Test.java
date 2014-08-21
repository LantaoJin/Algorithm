package org.alanjin.bigcircle;
import java.util.Random;


public class Test {
    public static void main(String[] args) {
        
        Random random = new Random();
        Point p0 = new Point(random.nextInt(20), random.nextInt(20));
        Point p1 = new Point(random.nextInt(20), random.nextInt(20));
        Point p2 = new Point(random.nextInt(20), random.nextInt(20));
        Point p3 = new Point(random.nextInt(20), random.nextInt(20));
        Point p4 = new Point(random.nextInt(20), random.nextInt(20));
        Point p5 = new Point(random.nextInt(20), random.nextInt(20));
        Point p6 = new Point(random.nextInt(20), random.nextInt(20));
        Axis axis = new Axis(p0, p1, p2, p3, p4, p5, p6);
        Circle theBigCircle = axis.findBigCircle();
        System.out.println(theBigCircle);
    }
}
