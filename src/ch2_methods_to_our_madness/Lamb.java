package ch2_methods_to_our_madness;

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
        return false;
    }

    @Override
    boolean isVegetarian() {
        return false;
    }
}
