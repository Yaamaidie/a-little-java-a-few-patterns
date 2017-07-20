package ch2_methods_to_our_madness;

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
        return s.onlyOnions();
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
