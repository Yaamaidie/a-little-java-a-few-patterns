package ch1_modern_toys;

/**
 * Created by lee on 2017/7/3.
 */
abstract class Layer {
    public String toString() {
        return "new " + this.getClass().getName() + "()";
    }
}
