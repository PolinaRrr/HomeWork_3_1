package Point3;

public class Main {
    public static void main(String[] args) {
        Box<Orange> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();
        Box<Apple> box5 =new Box<>();

        box1.fillBox(new Orange(), 25);
        box2.fillBox(new Apple(), 30);
        box3.fillBox(new Orange(), 25);
        box4.fillBox(new Apple(), 30);

        System.out.println(box1.getWeigth());
        System.out.println(box2.getWeigth());
        System.out.println(box1.compare(box2));
        System.out.println(box1.compare(box3));

        box1.shiftFruit(box3);
        System.out.println(box3.getWeigth());

    }

}
