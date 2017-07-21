package ch10_the_state_of_things_to_come;

/**
 * pie的制作人
 * Created by lee on 2017/7/20.
 */
class PiemanM implements PiemanI{
    PieD p = new Bottom();

    @Override
    public int addTopping(Object t) {
        p = new Topping(t, p);
        return occTopping(t);
    }

    @Override
    public int remTopping(Object t) {
        p = (PieD) p.accpet(new RemV(t));
        return occTopping(t);
    }

    @Override
    public int substTopping(Object n, Object o) {
        p = (PieD) p.accpet(new SubstV(n, o));
        return occTopping(n);
    }

    @Override
    public int occTopping(Object o) {
        return (int) p.accpet(new OccursV(o));
    }

    public static void main(String[] args) {
        PiemanM pm = new PiemanM();
        System.out.println(pm.occTopping(1)); //0
        System.out.println(pm.addTopping(2)); //1
        System.out.println(pm.addTopping(2)); //2
        System.out.println(pm.addTopping(2)); //3
        System.out.println(pm.remTopping(2)); //0
        System.out.println(pm.substTopping(2, 3));

    }

}
