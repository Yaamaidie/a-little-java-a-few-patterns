package ch8_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class Split extends Tree {
    Tree l;
    Tree r;
    Split(Tree _l, Tree _r) {
        l = _l;
        r = _r;
    }

    @Override
    Object accept(TreeVisitor ask) {
        return ask.forSplit(l, r);
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + l.toString() + ", " + r.toString() + ")";
    }
}
