package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
class CartesianPt extends Point {
    CartesianPt(int _x, int _y) {
        super(_x, _y);
    }

    @Override
    int distanceToO() {
        return (int) Math.floor(Math.sqrt(x * x + y * y));
    }

    public static void main(String[] args) {
        CartesianPt cpt = new CartesianPt(1, 2);
        CartesianPt cpt2 = new CartesianPt(3, 4);
        System.out.println(cpt2.minus(cpt));
        System.out.println(cpt.distanceToO());
    }
}
