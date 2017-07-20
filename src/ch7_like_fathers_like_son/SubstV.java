package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/19.
 */
class SubstV implements PieVisitor {
    Object n;
    Object o;

    SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }

    @Override
    public Pie forBottom() {
        return new Bottom();
    }

    @Override
    public Pie forTopping(Object t, Pie r) {
        if (o.equals(t)) {
            return new Topping(n, r.accpet(this));
        } else {
            return new Topping(t, r.accpet(this));
        }
    }
}
