package ch8_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class Bud extends Tree {

    @Override
    Object accept(TreeVisitor ask) {
        return ask.forBud();
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
