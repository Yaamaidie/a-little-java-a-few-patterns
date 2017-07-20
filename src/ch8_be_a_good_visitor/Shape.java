package ch8_be_a_good_visitor;

/**
 * Created by lee on 2017/7/19.
 */
abstract class Shape {
    abstract boolean accept(ShapeVisitor ask);
}
