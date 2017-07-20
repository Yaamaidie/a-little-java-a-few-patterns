package ch6_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class RemFish {
    Pie forBottom(Fish f) {
        return new Bottom();
    }

    Pie forTopping(Object t, Pie r, Fish f) {
        if (f.equals(t)) {
            return r.remFish(f);
        } else {
            return new Topping(t, r.remFish(f));
        }
    }
}
