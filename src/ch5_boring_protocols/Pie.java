package ch5_boring_protocols;

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
