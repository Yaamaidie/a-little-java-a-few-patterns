package ch2_methods_to_our_madness;

/**
 * 叉肉串的签子
 * Created by lee on 2017/7/7.
 */
class Skewer extends Shish{
    public static void main(String[] args) {
        new Skewer();
        System.out.println(new Onion(new Onion(new Skewer())).onlyOnions());
        System.out.println(new Onion(new Lamb(new Skewer())).onlyOnions());
        new Onion(new Lamb(new Onion(new Skewer())));
    }

    @Override
    boolean onlyOnions() {
        return true;
    }

    @Override
    boolean isVegetarian() {
        return true;
    }
}
