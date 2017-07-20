package ch3_what_is_new;

/**
 * Created by lee on 2017/7/7.
 */
abstract class PizzaD { //比萨饼
    abstract PizzaD remA(); //去除比萨饼中的凤尾鱼顶料(因为太咸了)
//    abstract PizzaD topAwC(); //在凤尾鱼顶料上加上奶酪顶料(这样会盖住凤尾鱼的咸味)
//    abstract PizzaD subAbC(); //将所有的凤尾鱼顶料换成奶酪顶料
}

class Crust extends PizzaD { //面包皮

    @Override
    PizzaD remA() {
        return new Crust();
    }
}

// 下面是各种顶料
class Cheese extends PizzaD { //奶酪
    PizzaD p;
    Cheese (PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return new Cheese(p.remA());
    }
}

class Olive extends PizzaD { //橄榄
    PizzaD p;
    Olive (PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return p.remA();
    }
}

class Anchovy extends PizzaD { //凤尾鱼
    PizzaD p;
    Anchovy (PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return p;
    }
}

class Sausage extends PizzaD { //香肠
    PizzaD p;
    Sausage (PizzaD _p) {
        p = _p;
    }

    @Override
    PizzaD remA() {
        return p.remA();
    }
}