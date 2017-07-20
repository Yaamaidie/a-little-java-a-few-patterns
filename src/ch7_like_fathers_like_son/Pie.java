package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/10.
 */
abstract class Pie {
    abstract Pie accpet(PieVisitor ask);

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
