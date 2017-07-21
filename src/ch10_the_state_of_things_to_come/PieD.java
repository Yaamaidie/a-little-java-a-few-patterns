package ch10_the_state_of_things_to_come;

/**
 * Created by lee on 2017/7/10.
 */
abstract class PieD {
    abstract Object accpet(PieVisitor ask);

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
