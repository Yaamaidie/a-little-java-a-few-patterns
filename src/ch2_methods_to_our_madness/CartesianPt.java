package ch2_methods_to_our_madness;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lee on 2017/7/3.
 */
class CartesianPt extends Point{
    int x;
    int y;
    CartesianPt(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public String toString() {
        return "new" + this.getClass().getName() + "(" + x + ", "+ y + ")";
    }
    int distanceToO() {
        return (int) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {

    }

}
