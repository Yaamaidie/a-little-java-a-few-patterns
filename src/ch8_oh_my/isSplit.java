package ch8_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class isSplit implements TreeVisitor {
    @Override
    public Object forBud() {
        return true;
    }

    @Override
    public Object forFlat(Fruit f, Tree t) {
        return false;
    }

    @Override
    public Object forSplit(Tree l, Tree r) {
        return (boolean)l.accept(this) && (boolean)r.accept(this);
    }
}
