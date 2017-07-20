package ch6_oh_my;

/**
 * 接口名中的b代表boolean
 * Created by lee on 2017/7/11.
 */
interface TreeVisitor {
    Object forBud();
    Object forFlat(Fruit f, Tree t);
    Object forSplit(Tree l, Tree r);
}
