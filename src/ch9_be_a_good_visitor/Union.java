package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/20.
 */
class Union extends Shape {
    Shape s;
    Shape t;

    Union(Shape _s, Shape _t) {
        s = _s;
        t = _t;
    }

    @Override
    boolean accept(ShapeVisitor ask) {
        return ((UnionVisitor) ask).forUnion(s, t);
    }
}
