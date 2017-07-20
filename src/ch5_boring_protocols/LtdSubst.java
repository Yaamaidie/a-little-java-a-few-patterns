package ch5_boring_protocols;

/**
 * Created by lee on 2017/7/11.
 */
class LtdSubst implements PieVisitor {
    int c;
    Object o;
    Object n;

    LtdSubst(int _c, Object _o, Object _n) {
        c = _c;
        o = _o;
        n = _n;
    }

    @Override
    public Pie forBottom() {
        return new Bottom();
    }

    @Override
    public Pie forTopping(Object t, Pie r) {
        if (c == 0) {
            return new Topping(t, r);
        } else if(o.equals(t)) {
            return new Topping(n, r.accpet(new LtdSubst(c - 1, o, n)));
        } else {
            return new Topping(t, r.accpet(this));
        }
    }

    public static void main(String[] args) {
        //测试
        Pie p = new Topping(new Integer(2),
                    new Topping(new Integer(3),
                        new Topping(new Integer(4),
                            new Topping(new Integer(4),
                                new Topping(new Integer(4),
                                    new Bottom())))));
        PieVisitor visitor = new LtdSubst(2, new Integer(4), new Integer(5));
        Pie result = p.accpet(visitor);
        System.out.println(result);
    }
}
