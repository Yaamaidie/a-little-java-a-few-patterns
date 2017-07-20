package ch6_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class Pear extends Fruit {
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Pear);
    }
}
