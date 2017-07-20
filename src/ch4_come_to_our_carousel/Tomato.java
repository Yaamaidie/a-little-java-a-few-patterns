package ch4_come_to_our_carousel;

/**
 * Created by lee on 2017/7/7.
 */
class Tomato extends Shish {
    Shish s;
    Tomato(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forTomato(s);
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forTomato(s);
    }
}
