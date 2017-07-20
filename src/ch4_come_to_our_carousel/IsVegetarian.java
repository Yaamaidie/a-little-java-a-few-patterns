package ch4_come_to_our_carousel;

/**
 * Created by lee on 2017/7/10.
 */
class IsVegetarian {
    boolean forSkewer() {
        return true;
    }

    boolean forOnion(Shish s) {
        return s.isVegetarian();
    }

    boolean forTomato(Shish s) {
        return s.isVegetarian();
    }

    boolean forLamb(Shish s) {
        return false;
    }
}
