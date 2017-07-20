package ch6_object_are_people_too;

/**
 * Created by lee on 2017/7/3.
 */
abstract class Num {
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
