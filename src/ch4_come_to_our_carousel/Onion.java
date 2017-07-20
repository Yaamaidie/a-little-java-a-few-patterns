package ch4_come_to_our_carousel;

/**
 * 洋葱
 * Created by lee on 2017/7/7.
 */
class Onion extends Shish{
    Shish s;
    Onion(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forOnion(s);
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forOnion(s);
    }
}
