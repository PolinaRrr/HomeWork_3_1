package Point3;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> box = new ArrayList<>();

    //метод сравнения веса хоробок
    public boolean compare(Box<?> b){
        if (Math.abs(this.getWeigth()-b.getWeigth())<0.00001) {
            return true;
        }else{
            return false;
        }
    }

    //метод расчета веса коробки,наполненной фруктами
    public float getWeigth() {
        float weigth = 0.0f;
        for (T o : box) {
            weigth += o.getMass();
        }
        return weigth;
    }

    //метод наполнения коробки
    public void fillBox(T fruit, int quantity){
        for (int i = 0; i <quantity ; i++) {
        box.add(fruit);
        }
    }

    //метод пересыпания из одной коробки в другую
    public void shiftFruit(Box<T> someBox) {
        someBox.box.addAll(box);
        box.clear();
    }
}
