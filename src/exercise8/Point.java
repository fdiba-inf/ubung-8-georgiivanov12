package exercise8;

import java.util.Scanner;

public class Point {
    public double xDim;
    public double yDim;

    public Point() {
        this.xDim = 0;
        this.yDim = 0;
    }

    public Point(double x, double y) {
        this.xDim = x;
        this.yDim = y;
    }

    public Point(Point otherPoint) {
        this.xDim = otherPoint.xDim;
        this.yDim = otherPoint.yDim;
    }

    public void initialize() {
        this.xDim = Utils.INPUT.nextDouble();
        this.yDim = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        this.xDim += xDelta;
        this.yDim += yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        return new Point(xDim + xDelta,yDim + yDelta);
    }

    public boolean equals(Point otherPoint) {
        if (Utils.equals(this.xDim, otherPoint.xDim) &&
            Utils.equals(this.yDim, otherPoint.yDim))   {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("(%.1f, %.1f)", this.xDim, this.yDim);
    }
}
