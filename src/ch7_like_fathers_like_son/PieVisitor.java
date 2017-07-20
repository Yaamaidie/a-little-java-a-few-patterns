package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/10.
 */
interface PieVisitor {
    Pie forBottom();
    Pie forTopping(Object t, Pie r);
}
