package ch4_come_to_our_carousel;

/**
 * 羊肉串
 * Created by lee on 2017/7/7.
 */
abstract class Shish {
    OnlyOnions ooFn = new OnlyOnions();
    IsVegetarian ivFn = new IsVegetarian();
    abstract boolean onlyOnions();
    abstract boolean isVegetarian();
}
