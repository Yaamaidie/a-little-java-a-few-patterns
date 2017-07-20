package ch8_oh_my;

/**
 * Created by lee on 2017/7/12.
 */
class iHeight implements TreeVisitor {
    @Override
    public Object forBud() {
        return 0;
    }

    @Override
    public Object forFlat(Fruit f, Tree t) {
        return ((int)t.accept(this) + 1);
    }

    @Override
    public Object forSplit(Tree l, Tree r) {
        return Math.max((int)l.accept(this), (int)r.accept(this)) + 1;
    }

    public static void main(String[] args) {
        Tree t = new Split(new Bud(), new Bud());
        TreeVisitor visitor = new iHeight();
        System.out.println(t.accept(visitor));

        Tree t2 =
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
        TreeVisitor visitor12 = new iHeight();
        System.out.println(t2.accept(visitor12));
    }
}
