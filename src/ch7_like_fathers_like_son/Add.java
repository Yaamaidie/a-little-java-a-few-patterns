package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
class Add extends Set {
    Integer i;
    Set s;

    Add(Integer _i, Set _s) {
        i = _i;
        s = _s;
    }

    @Override
    boolean mem(Integer n) {
        if (i.equals(n)) {
            return true;
        } else {
            return s.mem(n);
        }
    }

    @Override
    Set plus(Set t) {
        return s.plus(t.add(i));
    }

    @Override
    Set diff(Set t) {
        if (t.mem(i)) {
            return s.diff(t);
        } else {
            return s.diff(t).add(i);
        }
    }

    @Override
    Set prod(Set t) {
        if (t.mem(i)) {
            return s.prod(t).add(i);
        } else {
            return s.prod(t);
        }
    }

    @Override
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "(" + i.toString() + ", "  + s.toString() + ")";
    }
}
