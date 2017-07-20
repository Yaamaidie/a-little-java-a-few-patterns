package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
interface ShapeVisitor {
    boolean forCircle(int r);
    boolean forSquare(int s);
    boolean forTrans(Point q, Shape s);
}
