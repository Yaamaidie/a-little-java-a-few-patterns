package ch4_come_to_our_carousel;

/**
 * 羊肉
 * Created by lee on 2017/7/7.
 */
class Lamb extends Shish {
    Shish s;
    Lamb(Shish _s) {
        s = _s;
    }

    @Override
    boolean onlyOnions() {
        return ooFn.forLamb(s);
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forLamb(s);
    }
}
