package ch10_the_state_of_things_to_come;

/**
 * Created by lee on 2017/7/10.
 */
class RemV implements PieVisitor {
    Object o;

    RemV(Object _o) {
        o = _o;
    }

    @Override
    public Object forBottom(Bottom that) {
        return that;
    }

    @Override
    public Object forTopping(Topping that) {
        if (o.equals(that.t)) {
            return that.r.accpet(this);
        } else {
            return new Topping(that.t, (PieD) that.r.accpet(this));
        }
    }
}
