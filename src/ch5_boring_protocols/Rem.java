package ch5_boring_protocols;

/**
 * Created by lee on 2017/7/10.
 */
class Rem implements PieVisitor {
    Object o;

    Rem(Object _o) {
        o = _o;
    }

    public Pie forBottom() {
        return new Bottom();
    }

    public Pie forTopping(Object t, Pie r) {
        if (o.equals(t)) {
            return r.accpet(this);
        } else {
            return new Topping(t, r.accpet(this));
        }
    }
}
