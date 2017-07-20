package ch6_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
abstract class Fruit {
    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
