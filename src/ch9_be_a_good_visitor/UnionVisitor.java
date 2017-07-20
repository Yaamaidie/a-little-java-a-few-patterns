package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/20.
 */
interface UnionVisitor extends ShapeVisitor {
    boolean forUnion(Shape s, Shape t);
}
