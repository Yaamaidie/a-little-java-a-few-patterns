package ch1_modern_toys;

/**
 * Created by lee on 2017/7/3.
 */
public class Slice extends Layer {
    Layer l;
    Slice(Layer _l) {
        l = _l;
    }
    public String toString() {
        return "new " + this.getClass().getName() + "(" + l + ")";
    }
}
