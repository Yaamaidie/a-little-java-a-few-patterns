package ch4_object_are_people_too;

/**
 * Created by lee on 2017/7/10.
 */
abstract class Pie {
    RemA raFn = new RemA();
    RemFish rfFn = new RemFish();
    RemInt riFn = new RemInt();
    Rem remFn = new Rem();
    Subst substFn = new Subst();
    abstract Pie remA();
    abstract Pie remFish(Fish f);
    abstract Pie remInt(Integer i);
    abstract Pie rem(Object o);
    abstract  Pie subst(Object n, Object o);

    public String toString() {
        return "new " + this.getClass().getSimpleName() + "()";
    }
}
