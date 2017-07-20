package ch4_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
abstract class Fish {
    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
