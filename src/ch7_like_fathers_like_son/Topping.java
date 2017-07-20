package ch7_like_fathers_like_son;


/**
 * Created by lee on 2017/7/10.
 */
class Topping extends Pie {
    Object t;
    Pie r;

    Topping(Object _t, Pie _r) {
        t = _t;
        r = _r;
    }

    @Override
    Pie accpet(PieVisitor ask) {
        return ask.forTopping(t, r);
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + t.toString() + ", " + r.toString() + ")";
    }
}
