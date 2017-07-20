package ch5_boring_protocols;

/**
 * Created by lee on 2017/7/10.
 */
class Bottom extends Pie{
    @Override
    Pie accpet(PieVisitor ask) {
        return ask.forBottom();
    }
}
