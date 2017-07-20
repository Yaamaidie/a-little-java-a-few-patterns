package ch6_object_are_people_too;

/**
 * Created by lee on 2017/7/3.
 */
class OneMoreThan extends Num {
    Num predecessor;

    OneMoreThan(Num _p) {
        predecessor = _p;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OneMoreThan) {
            return predecessor.equals(((OneMoreThan) obj).predecessor);
        } else {
            return false;
        }
    }

    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + predecessor + ")";
    }
    public static void main(String[] args) {
        Num x = new OneMoreThan(
                new OneMoreThan(
                        new OneMoreThan(
                                new OneMoreThan(
                                        new Zero()
                                )
                        )
                )
        );
        System.out.println(x);
    }
}
