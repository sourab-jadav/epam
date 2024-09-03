package com.epam.rd.autotasks.intersection;

public class Line {
    private int k;
    private int b;
    Line(int k,int b){
        this.k=k;
        this.b=b;
    }
    public Point intersection(Line other){
  // Check if the lines are parallel (same slope)
        if (this.k == other.k) {
            // Check if the lines are coincident (same y-intercept)
            if (this.b == other.b) {
                return null; // Lines coincide, return null
            } else {
                return null; // Lines are parallel and do not intersect
            }
        }

        // Calculate the x-coordinate of the intersection point
        int x = (other.b - this.b) / (this.k - other.k);

        // Calculate the y-coordinate of the intersection point
        int y = this.k * x + this.b;

        return new Point(x,y);

    }
}
