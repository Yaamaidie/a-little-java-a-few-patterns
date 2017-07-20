package ch4_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class Topping extends Pie{
    Object t;
    Pie r;

    Topping(Object _t, Pie _r) {
        t = _t;
        r = _r;
    }

    @Override
    Pie remA() {
        return raFn.forTopping(t, r);
    }

    @Override
    Pie remFish(Fish f) {
        return rfFn.forTopping(t, r, f);
    }

    @Override
    Pie remInt(Integer i) {
        return riFn.forTopping(t, r, i);
    }

    @Override
    Pie rem(Object o) {
        return remFn.forTopping(t, r, o);
    }

    @Override
    Pie subst(Object n, Object o) {
        return substFn.forTopping(t, r, n, o);
    }

    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + t.toString() + ", " + r.toString() + ")";
    }

    public static void main(String[] args) {
        //删除凤尾鱼
        Topping t = new Topping(new Anchovy(),
                        new Topping(new Tuna(),
                            new Topping(new Anchovy(),
                                new Bottom())));
        System.out.println(t.remA());

        //删除各种鱼
        Topping t2 = new Topping(new Anchovy(),
                        new Bottom());
        System.out.println(t2.remFish(new Anchovy()));

        //删除整数
        Topping t3 = new Topping(new Integer(2),
                        new Topping(new Integer(3),
                            new Topping(new Integer(2),
                                new Bottom())));
        System.out.println(t3.remInt(new Integer(3)));

        //删除任意对象
        Topping t4 = new Topping(new String("AAA"),
                        new Topping(new Integer(2),
                            new Topping(new Anchovy(),
                                new Bottom())));
        System.out.println(t4.rem(new String("AAA"))); //删除字符串
        System.out.println(t4.rem(new Integer(2))); //删除数字
        System.out.println(t4.rem(new Anchovy())); //删除凤尾鱼

        //zero和OneMoreThan的remove
        Topping t5 = new Topping(new Zero(),
                        new Topping(new OneMoreThan(new Zero()),
                            new Topping(new OneMoreThan(new OneMoreThan(new Zero())),
                                    new Bottom())));
        System.out.println(t5.rem(new Zero()));
        System.out.println(t5.rem(new OneMoreThan(new Zero())));
        System.out.println(t5.rem(new OneMoreThan(new OneMoreThan(new Zero()))));

        //替代
        Topping t6 = new Topping(new Integer(3),
                        new Topping(new Integer(2),
                            new Topping(new Integer(3),
                                new Bottom())));
        System.out.println(t6.subst(new Integer(5), new Integer(3)));
    }
}
