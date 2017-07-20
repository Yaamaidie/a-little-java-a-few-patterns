package ch4_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class RemInt {
    Pie forBottom(Integer i) {
        return new Bottom();
    }

    Pie forTopping(Object t, Pie r, Integer i) {
        if (i.equals(t)) {
            return r.remInt(i);
        } else {
            return new Topping(t, r.remInt(i));
        }
    }
}
