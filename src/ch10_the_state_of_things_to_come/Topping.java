package ch10_the_state_of_things_to_come;

/**
 * Created by lee on 2017/7/10.
 */
class Topping extends PieD {
    Object t;
    PieD r;

    Topping(Object _t, PieD _r) {
        t = _t;
        r = _r;
    }

    @Override
    Object accpet(PieVisitor ask) {
        return ask.forTopping(this);
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + t.toString() + ", " + r.toString() + ")";
    }
}
