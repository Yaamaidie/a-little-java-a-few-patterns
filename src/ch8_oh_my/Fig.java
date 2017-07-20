package ch8_oh_my;

/**
 * Created by lee on 2017/7/11.
 */
class Fig extends Fruit {
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Fig);
    }
}
