package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/18.
 */
abstract class Eval implements ExprVisitor{
    @Override
    public Object forPlus(Expr l, Expr r) {
        return plus(l.accept(this), r.accept(this));
    }

    @Override
    public Object forProd(Expr l, Expr r) {
        return prod(l.accept(this), r.accept(this));
    }

    @Override
    public Object forDiff(Expr l, Expr r) {
        return diff(l.accept(this), r.accept(this));
    }

    @Override
    public Object forConst(Object c) {
        return c;
    }

    abstract Object plus(Object l, Object r);
    abstract Object diff(Object l, Object r);
    abstract Object prod(Object l, Object r);
}
