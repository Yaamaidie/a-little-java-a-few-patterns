package ch6_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class hasFruit implements TreeVisitor {
    @Override
    public Object forBud() {
        return true;
    }

    @Override
    public Object forFlat(Fruit f, Tree t) {
        return true;
    }

    @Override
    public Object forSplit(Tree l, Tree r) {
        if ((boolean)l.accept(this)) {
            return r.accept(this);
        } else {
            return false;
        }
    }
}
