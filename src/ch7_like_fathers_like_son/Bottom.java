package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/10.
 */
class Bottom extends Pie {
    @Override
    Pie accpet(PieVisitor ask) {
        return ask.forBottom();
    }
}
