package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
class IntEval extends Eval {

    @Override
    Object plus(Object l, Object r) {
        return (int) l + (int) (r);
    }

    @Override
    Object diff(Object l, Object r) {
        return (int) l - (int) r;
    }

    @Override
    Object prod(Object l, Object r) {
        return (int) l * (int) r;
    }

    public static void main(String[] args) {
        Expr e =
                new Plus(
                        new Diff(
                                new Const(5),
                                new Const(1)),
                        new Const(2));

        ExprVisitor v = new IntEval();
        System.out.println(e.accept(v));
    }
}
