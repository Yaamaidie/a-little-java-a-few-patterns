package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
class Const extends Expr {
    Object c;

    Const(Object _c) {
        c = _c;
    }

    @Override
    Object accept(ExprVisitor ask) {
        return ask.forConst(c);
    }

    @Override
    public String toString() {
        return "new Const(" + c.toString() +" )";
    }
}
