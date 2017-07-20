package ch8_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
class Square extends Shape {
    int s;
    Square(int _s) {
        s = _s;
    }

    @Override
    boolean accept(ShapeVisitor ask) {
        return ask.forSquare(s);
    }
}
