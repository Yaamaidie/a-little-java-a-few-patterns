package ch2_methods_to_our_madness;

/**
 * Created by lee on 2017/7/3.
 */
class ManhattanPt extends Point {
    int x;
    int y;
    ManhattanPt(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public String toString() {
        return "new" + this.getClass().getName() + "(" + x + ", "+ y + ")";
    }
    int distanceToO() {
        return x + y;
    }
}
