package ch8_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
class ManhattanPt extends Point {
    ManhattanPt(int _x, int _y) {
        super(_x, _y);
    }

    @Override
    int distanceToO() {
        return x + y;
    }

    public static void main(String[] args) {
        ManhattanPt mpt = new ManhattanPt(2, 4);
        System.out.println(mpt);
        System.out.println(mpt.distanceToO());
    }
}
