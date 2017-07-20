package ch1_modern_toys;

/**
 * Created by lee on 2017/7/3.
 */
public class OneMoreThan extends Num {
    Num predecessor;

    OneMoreThan(Num _p) {
        predecessor = _p;
    }

    public String toString() {
        return "new " + this.getClass().getName() + "(" + predecessor + ")";
    }
    public static void main(String[] args) {
        Num x = new OneMoreThan(
                new OneMoreThan(
                        new OneMoreThan(
                                new OneMoreThan(
                                        new Zero()
                                )
                        )
                )
        );
        System.out.println(x);
    }
}
