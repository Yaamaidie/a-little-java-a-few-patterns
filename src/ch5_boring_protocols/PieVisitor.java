package ch5_boring_protocols;

/**
 * Created by lee on 2017/7/10.
 */
interface PieVisitor {
    Pie forBottom();
    Pie forTopping(Object t, Pie r);
}
