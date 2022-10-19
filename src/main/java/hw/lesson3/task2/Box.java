package hw.lesson3.task2;

import java.util.ArrayList;

public class Box <F extends Fruit> {

    private ArrayList<F> list;

    public ArrayList<F> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<>();
    }

    public void add(F item) {
        list.add(item);
    }

    public void move(Box<F> newBox) {
        newBox.getList().addAll(list);
        list.clear();
    }

    public float getWeight() {
        if (list.isEmpty())
            return 0;
        else
            return list.size()*list.get(0).getWeight();
    }

    public String getInsideBox() {
        if (list.isEmpty())
            return "Empty";
        return list.get(0).toString();
    }

    public String compare(Box <? extends Fruit> box){
        if (this.getWeight() == box.getWeight())
            return "=";
        else if (this.getWeight() < box.getWeight())
            return "<";
        else return ">";
    }

    public String getInfo() {
        return ("contains " + this.getInsideBox() + " weight=" + this.getWeight());
    }
}
