package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
class Circle extends Shape {
    int r;
    Circle(int _r) {
        r = _r;
    }

    @Override
    boolean accept(ShapeVisitor ask) {
        return ask.forCircle(r);
    }

}
