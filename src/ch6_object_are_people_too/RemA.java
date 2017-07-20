package ch6_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class RemA {
    Pie forBottom() {
        return new Bottom();
    }

    Pie forTopping(Object t, Pie r) {
        if (new Anchovy().equals(t)) {
            return r.remA();
        } else {
            return new Topping(t, r.remA());
        }
    }
}
