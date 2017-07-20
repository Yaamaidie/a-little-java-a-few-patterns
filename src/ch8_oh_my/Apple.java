package ch8_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class Apple extends Fruit {
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Apple;
    }
}
