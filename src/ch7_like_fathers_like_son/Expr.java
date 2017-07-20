package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
abstract class Expr {
    abstract Object accept(ExprVisitor ask);
}
