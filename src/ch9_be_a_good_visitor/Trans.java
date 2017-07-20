package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/20.
 */
class Trans extends Shape {
    Point q;
    Shape s;

    Trans(Point _q, Shape _s) {
        q = _q;
        s = _s;
    }

    @Override
    boolean accept(ShapeVisitor ask) {
        return ask.forTrans(q, s);
    }
}
