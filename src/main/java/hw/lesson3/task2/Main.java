package hw.lesson3.task2;

public class Main {

    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        box1.add(new Apple());
        for (int i = 0; i < 5; i++) {
            box2.add(new Apple());
        }
        for (int i = 0; i < 3; i++) {
            box3.add(new Orange());
        }

        System.out.println("Box1: " + box1.getInfo());
        System.out.println("Box2: " + box2.getInfo());
        System.out.println("Box3: " + box3.getInfo());

        System.out.println("Weight compare: Box2 " + box2.compare(box3) + " Box3");

        box1.move(box2);
        System.out.println("Box1: " + box1.getInfo());
        System.out.println("Box2: " + box2.getInfo());
    }

}
