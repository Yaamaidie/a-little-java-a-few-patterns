package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/19.
 */
class LtdSubstV extends SubstV {
    int c;

    LtdSubstV(int _c, Object _n, Object _o) {
        super(_n, _o);
        c = _c;
    }

    @Override
    public Pie forTopping(Object t, Pie r) {
        if (c == 0) {
            return new Topping(t ,r);
        } else if (o.equals(t)) {
            return new Topping(n, r.accpet(new LtdSubstV(c -1, n, o)));
        } else {
            return new Topping(t, r.accpet(this));
        }
    }
}
