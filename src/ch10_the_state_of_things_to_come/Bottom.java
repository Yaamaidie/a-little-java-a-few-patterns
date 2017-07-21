package ch10_the_state_of_things_to_come;

/**
 * Created by lee on 2017/7/10.
 */
class Bottom extends PieD {
    @Override
    Object accpet(PieVisitor ask) {
        return ask.forBottom(this);
    }
}
