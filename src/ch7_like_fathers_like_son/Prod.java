package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
class Prod extends Expr {
    Expr l;
    Expr r;

    Prod(Expr _l, Expr _r) {
        l = _l;
        r = _r;
    }
    @Override
    Object accept(ExprVisitor ask) {
        return ask.forProd(l, r);
    }

    @Override
    public String toString() {
        return "new Prod(" + l.toString() + ", " + r.toString() + ")";
    }
}
