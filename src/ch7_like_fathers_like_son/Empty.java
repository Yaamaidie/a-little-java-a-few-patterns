package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
class Empty extends Set{
    boolean mem(Integer i) {
        return false;
    }

    @Override
    Set plus(Set s) {
        return s;
    }

    @Override
    Set diff(Set s) {
        return new Empty();
    }

    @Override
    Set prod(Set s) {
        return new Empty();
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
