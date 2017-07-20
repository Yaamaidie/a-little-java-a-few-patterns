package ch6_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class isFlat implements TreeVisitor {
    @Override
    public Object forBud() {
        return true;
    }

    @Override
    public Object forFlat(Fruit f, Tree t) {
        return t.accept(this);
    }

    @Override
    public Object forSplit(Tree l, Tree r) {
        return false;
    }
}
