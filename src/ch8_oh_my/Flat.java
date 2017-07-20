package ch8_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class Flat extends Tree {
    Fruit f;
    Tree t;
    Flat(Fruit _f, Tree _t) {
        f = _f;
        t = _t;
    }

    @Override
    Object accept(TreeVisitor ask) {
        return ask.forFlat(f, t);
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + f.toString() + ", " + t.toString() + ")";
    }
}
