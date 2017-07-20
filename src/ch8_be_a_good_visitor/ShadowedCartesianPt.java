package ch8_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
class ShadowedCartesianPt extends CartesianPt{
    int dx;
    int dy;

    ShadowedCartesianPt(int _x, int _y, int _dx, int _dy) {
        super(_x, _y);
        dx = _dx;
        dy = _dy;
    }

    @Override
    int distanceToO() {
        return new CartesianPt(x + dx, y + dy).distanceToO();
    }

    public static void main(String[] args) {
        ShadowedCartesianPt scpt = new ShadowedCartesianPt(12, 5, 3, 4);
        System.out.println(scpt.distanceToO());

        System.out.println(new CartesianPt(3, 4).closerToO(new ShadowedCartesianPt(1, 5, 1, 2)));
    }
}
