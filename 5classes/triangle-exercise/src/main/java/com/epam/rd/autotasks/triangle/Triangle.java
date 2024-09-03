package com.epam.rd.autotasks.triangle;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        if (isDegenerative(p1, p2, p3)) {
            throw new IllegalArgumentException("Triangle is degenerative.");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private boolean isDegenerative(Point p1, Point p2, Point p3) {
        // Check if the points are collinear by comparing the slopes
        double slope1 = (p2.getY() - p1.getY()) * (p3.getX() - p2.getX());
        double slope2 = (p3.getY() - p2.getY()) * (p2.getX() - p1.getX());
        return slope1 == slope2;
    }

    public double area() {
        // Calculate the area using the determinant formula
        return Math.abs(
            (p1.getX() * (p2.getY() - p3.getY()) +
             p2.getX() * (p3.getY() - p1.getY()) +
             p3.getX() * (p1.getY() - p2.getY())) / 2.0);
    }

    public Point centroid() {
        double centroidX = (p1.getX() + p2.getX() + p3.getX()) / 3.0;
        double centroidY = (p1.getY() + p2.getY() + p3.getY()) / 3.0;
        return new Point(centroidX, centroidY);
    }
}
