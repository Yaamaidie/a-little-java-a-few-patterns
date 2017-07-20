package ch6_object_are_people_too;

/**
 * subst即substitude替代
 * Created by lee on 2017/7/10.
 */
class Subst {
    Pie forBottom(Object n, Object o) {
        return new Bottom();
    }

    Pie forTopping(Object t, Pie r, Object n, Object o) {
        if (o.equals(t)) {
            return new Topping(n, r.subst(n , o));
        } else {
            return new Topping(t, r.subst(n, o));
        }
    }
}
