package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/20.
 */
class UnionHasPt extends HasPt implements UnionVisitor{
    UnionHasPt(Point _p) {
        super(_p);
    }

    @Override
    ShapeVisitor newHasPt(Point p) {
        return new UnionHasPt(p);
    }

    /**
     * check whether the point is in one or the other part of union
     */
    @Override
    public boolean forUnion(Shape s, Shape t) {
        return s.accept(this) || t.accept(this);
    }

    public static void main(String[] args) {
        //方法调用：UnionHasPt.forTrans(Point q, Shape s)；
        //内部调用 s.accept(newHasPt(Point p))方法
        System.out.println(
                new Trans(
                    new CartesianPt(3, 7),
                    new Union(
                        new Square(10),
                        new Circle(10)
                    )
                ).accept(
                    new UnionHasPt(
                        new CartesianPt(13, 17)
                    )
                )
        );
    }
}
