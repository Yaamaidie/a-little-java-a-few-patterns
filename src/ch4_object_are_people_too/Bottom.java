package ch4_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
class Bottom extends Pie{
    @Override
    Pie remA() {
        return raFn.forBottom();
    }

    @Override
    Pie remFish(Fish f) {
        return rfFn.forBottom(f);
    }

    @Override
    Pie remInt(Integer i) {
        return riFn.forBottom(i);
    }

    @Override
    Pie rem(Object o) {
        return remFn.forBottom(o);
    }

    @Override
    Pie subst(Object n, Object o) {
        return substFn.forBottom(n, o);
    }
}
