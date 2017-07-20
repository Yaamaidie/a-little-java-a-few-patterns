package ch5_boring_protocols;

/**
 * subst即substitude替代
 * Created by lee on 2017/7/10.
 */
class Subst implements PieVisitor{
    Object n;
    Object o;
    Subst(Object _n, Object _o) {
        n = _n;
        o = _o;
    }

    public Pie forBottom() {
        return new Bottom();
    }

    public Pie forTopping(Object t, Pie r) {
        if (o.equals(t)) {
            return new Topping(n, r.accpet(this));
        } else {
            return new Topping(t, r.accpet(this));
        }
    }
}
