package ch8_oh_my;

/**
 * Created by lee on 2017/7/12.
 */
class iOccurs implements TreeVisitor{
    Fruit a;
    iOccurs(Fruit _a) {
        a = _a;
    }
    @Override
    public Object forBud() {
        return 0;
    }

    @Override
    public Object forFlat(Fruit f, Tree t) {
        if (a.equals(f)) {
            return (int)t.accept(this) + 1;
        } else {
            return t.accept(this);
        }
    }

    @Override
    public Object forSplit(Tree l, Tree r) {
        return (int)l.accept(this) + (int)r.accept(this);
    }

    public static void main(String[] args) {
        Tree t =
                new Split(
                        new Split(
                                new Flat(new Fig(),
                                        new Bud()),
                                new Flat(new Fig(),
                                        new Bud())),
                        new Flat(new Fig(),
                                new Flat(new Lemon(),
                                        new Flat(new Apple(),
                                                new Bud()))));
        TreeVisitor v = new iOccurs(new Fig());
        System.out.println(t.accept(v));
    }
}
