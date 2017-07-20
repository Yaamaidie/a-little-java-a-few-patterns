package ch9_be_a_good_visitor;

/**
 * Created by lee on 2017/7/20.
 */
class HasPt implements ShapeVisitor {
    Point p;

    HasPt(Point _p) {
        p = _p;
    }

    ShapeVisitor newHasPt(Point p) {
        return new HasPt(p);
    }
    @Override
    public boolean forCircle(int r) {
        return p.distanceToO() <= r;
    }

    @Override
    public boolean forSquare(int s) {
        return p.x <= s && p.y <= s;
    }

    @Override
    public boolean forTrans(Point q, Shape s) {
        return s.accept(newHasPt((p.minus(q))));
    }

    public static void main(String[] args) {
        System.out.println((new Circle(10).accept(new HasPt(new CartesianPt(10, 10)))));
        System.out.println((new Square(10).accept(new HasPt(new CartesianPt(10, 10)))));
        System.out.println(new Trans(new CartesianPt(5, 6), new Circle(10))
                .accept(new HasPt(new CartesianPt(10, 10))));
        System.out.println(
                new Trans(
                        new CartesianPt(5, 4), //圆心为（5+5, 4+6）= (10, 10)
                        new Trans(
                                new CartesianPt(5, 6), //圆心为（5， 6）
                                new Circle(10)
                        ))
        .accept(new HasPt(new CartesianPt(10, 10))));
    }
}
