package ch5_boring_protocols;

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

    public static void main(String[] args) {
        Pie t6 = new Topping(new Integer(3),
                        new Topping(new Integer(2),
                            new Topping(new Integer(3),
                                new Bottom())));
        PieVisitor pv = new Rem(new Integer(2));
        System.out.println(t6.accpet(pv));
    }
}
