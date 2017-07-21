package ch10_the_state_of_things_to_come;

/**
 * Created by lee on 2017/7/10.
 */
interface PieVisitor {
    Object forBottom(Bottom that);
    Object forTopping(Topping that);
}
