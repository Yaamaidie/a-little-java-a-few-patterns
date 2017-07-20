package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
class SetEval extends Eval{
    @Override
    Object plus(Object l, Object r) {
        return ((Set) l).plus((Set) r);
    }

    @Override
    Object diff(Object l, Object r) {
        return ((Set) l).diff((Set) r);
    }

    @Override
    Object prod(Object l, Object r) {
        return  ((Set) l).prod((Set) r);
    }

    public static void main(String[] args) {
        Expr expr =
                new Prod(
                        new Const(new Empty()
                        .add(7)),
                        new Const(new Empty()
                        .add(3))
                );
        ExprVisitor v = new SetEval();
        System.out.println(expr.accept(v));
    }
}
