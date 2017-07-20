package ch7_like_fathers_like_son;

/**
 * Created by lee on 2017/7/12.
 */
abstract class Set {
    Set add(Integer i) {
        if (mem(i)) {
            return this;
        } else {
            return new Add(i, this);
        }
    }
    abstract boolean mem(Integer i);
    abstract Set plus(Set s);
    abstract Set diff(Set s);
    abstract Set prod(Set s);
}
