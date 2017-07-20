package ch2_methods_to_our_madness;

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
        return false;
    }

    @Override
    boolean isVegetarian() {
        return s.isVegetarian();
    }
}
