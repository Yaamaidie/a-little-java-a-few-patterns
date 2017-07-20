package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
class ShadowedManhattanPt extends ManhattanPt {
    int dx;
    int dy;

    ShadowedManhattanPt(int _x, int _y, int _dx, int _dy) {
        super(_x, _y);
        dx = _dx;
        dy = _dy;
    }

    @Override
    int distanceToO() {
        return super.distanceToO() + dx + dy;
    }
}
