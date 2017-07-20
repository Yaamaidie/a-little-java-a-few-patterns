package ch6_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class Rem {
    Pie forBottom(Object o) {
        return new Bottom();
    }

    Pie forTopping(Object t, Pie r, Object o) {
        if (o.equals(t)) {
            return r.rem(o);
        } else {
            return new Topping(t, r.rem(o));
        }
    }
}
