package ch4_come_to_our_carousel;

/**
 * 访问者
 * Created by lee on 2017/7/7.
 */
class OnlyOnions {
    boolean forSkewer() {
        return true;
    }
    boolean forOnion(Shish s) {
        return s.onlyOnions();
    }
    boolean forLamb(Shish s) {
        return false;
    }
    boolean forTomato(Shish s) {
        return false;
    }
}
