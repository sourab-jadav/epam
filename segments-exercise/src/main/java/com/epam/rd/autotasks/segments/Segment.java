package com.epam.rd.autotasks.segments;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point start, Point end) {
        if (start.getX()==end.getX() && start.getY() == end.getY() ) {
            throw new IllegalArgumentException();
        }else{
            this.p1=start;
            this.p2=end;
        }
    }
    double length() {
        return sqrt(pow(abs(this.p2.getX()-this.p1.getX()), 2)+pow(abs(this.p2.getY()-this.p1.getY()),2));
    }
    Point middle() {
        return new Point((this.p1.getX()+this.p2.getX())/2.0, (this.p1.getY()+this.p2.getY())/2.0);
    }
 public Point intersection(Segment another) {
        double x1 = this.p1.getX(), y1 = this.p1.getY();
        double x2 = this.p2.getX(), y2 = this.p2.getY();
        double x3 = another.p1.getX(), y3 = another.p1.getY();
        double x4 = another.p2.getX(), y4 = another.p2.getY();
        // Calculate the denominator
        double denom = (y4 - y3) * (x2 - x1) - (x4 - x3) * (y2 - y1);
        // If denom is 0, the segments are collinear or parallel
        if (denom == 0) {
            return null;
        }
        // Calculate the intersection point using the determinant method
        double ua = ((x4 - x3) * (y1 - y3) - (y4 - y3) * (x1 - x3)) / denom;
        double ub = ((x2 - x1) * (y1 - y3) - (y2 - y1) * (x1 - x3)) / denom;
        // If ua and ub are between 0 and 1, the segments intersect
        if (ua >= 0 && ua <= 1 && ub >= 0 && ub <= 1) {
            double intersectionX = x1 + ua * (x2 - x1);
            double intersectionY = y1 + ua * (y2 - y1);
            return new Point(intersectionX, intersectionY);
        }
        // Otherwise, they do not intersect
        return null;
    }

}
