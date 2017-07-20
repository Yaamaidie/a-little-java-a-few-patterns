package ch4_come_to_our_carousel;

/**
 * 叉肉串的签子
 * Created by lee on 2017/7/7.
 */
class Skewer extends Shish{

    @Override
    boolean onlyOnions() {
        return ooFn.forSkewer();
    }

    @Override
    boolean isVegetarian() {
        return ivFn.forSkewer();
    }
}
