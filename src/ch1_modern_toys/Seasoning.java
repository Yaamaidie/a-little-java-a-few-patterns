package ch1_modern_toys;

/**
 * 调味品
 * Created by lee on 2017/7/3.
 */
abstract class Seasoning {
    public String toString() {
        return "new " + getClass().getName() + "()";
    }
}
