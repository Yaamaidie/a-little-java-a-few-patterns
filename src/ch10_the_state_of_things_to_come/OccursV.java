package ch10_the_state_of_things_to_come;

/**
 * Created by lee on 2017/7/20.
 */
class OccursV implements PieVisitor {
    Object a;
    OccursV(Object _a) {
        a = _a;
    }

    @Override
    public Object forBottom(Bottom that) {
        return 0;
    }

    @Override
    public Object forTopping(Topping that) {
        if (that.t.equals(a)) {
            return (int) that.r.accpet(this) + 1;
        } else {
            return that.r.accpet(this);
        }
    }
}
