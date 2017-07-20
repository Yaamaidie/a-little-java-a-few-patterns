package ch6_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
abstract class Tree {
    abstract Object accept(TreeVisitor ask);
}
