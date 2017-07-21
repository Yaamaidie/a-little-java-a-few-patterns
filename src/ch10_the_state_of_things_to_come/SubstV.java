package ch10_the_state_of_things_to_come;

/**
 * subst即substitude替代
 * Created by lee on 2017/7/10.
 */
class SubstV implements PieVisitor {
    Object n;
    Object o;
    SubstV(Object _n, Object _o) {
        n = _n;
        o = _o;
    }

    @Override
    public Object forBottom(Bottom that) {
        return that;
    }

    @Override
    public Object forTopping(Topping that) {
        if (o.equals(that.t)) {
            that.t = n
            ;
            that.r.accpet(this)
            ;
            return that;
        } else {
            that.r.accpet(this)
            ;
            return that;
        }
    }
}
