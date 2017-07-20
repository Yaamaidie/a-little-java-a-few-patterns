package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
interface ExprVisitor {
    Object forPlus(Expr l, Expr r);
    Object forDiff(Expr l, Expr r);
    Object forProd(Expr l, Expr r);
    Object forConst(Object c);
}
