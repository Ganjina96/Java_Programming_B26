package day51_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {

        Square shape1 = new Square(4.5);
        System.out.println(shape1);
        System.out.println(shape1.area());
        System.out.println(shape1.perimeter());

        Circle shape2 = new Circle(0.5);
        System.out.println(shape2);
        System.out.println(shape2.area());
        System.out.println(shape2.perimeter());
    }
}
