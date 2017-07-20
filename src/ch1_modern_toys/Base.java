package ch1_modern_toys;

/**
 * Created by lee on 2017/7/3.
 */
public class Base extends Layer {
    Object o;

    Base(Object _o) {
        o = _o;
    }

    public String toString() {
        return "new " + this.getClass().getName() + "(" + o + ")";
    }

    public static void main(String[] args) {
        System.out.println(new Base(new Zero()));
    }
}
