package ch6_oh_my;

/**
 * Created by lee on 2017/7/12.
 */
class tSubst implements TreeVisitor {
    Fruit n;
    Fruit o;

    tSubst(Fruit _n, Fruit _o) {
        n = _n;
        o = _o;
    }
    @Override
    public Tree forBud() {
        return new Bud();
    }

    @Override
    public Tree forFlat(Fruit f, Tree t) {
        if (o.equals(f)) {
            return new Flat(n, (Tree) t.accept(this));
        } else {
            return new Flat(f, (Tree) t.accept(this));
        }
    }

    @Override
    public Tree forSplit(Tree l, Tree r) {
        return new Split((Tree) l.accept(this), (Tree) r.accept(this));
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
        TreeVisitor v = new tSubst(new Apple(), new Fig());
        System.out.println(t.accept(v));
    }
}
