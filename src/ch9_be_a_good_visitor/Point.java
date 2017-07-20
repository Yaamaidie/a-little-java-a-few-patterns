package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/3.
 */
abstract class Point {
    int x;
    int y;
    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    boolean closerToO(Point p) {
        return distanceToO() <= p.distanceToO();
    }

    Point minus(Point p) {
        return new CartesianPt(x - p.x, y - p.y);
    }

    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + x + ", " + y + ")";
    }

    abstract int distanceToO();
}
