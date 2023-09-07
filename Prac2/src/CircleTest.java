public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Point center1 = new Point(2.0, 4.0);
        Point center2 = new Point(-3.3, 7.0);
        circle1.setCenter(center1);
        circle1.setRadius(5.6);
        System.out.println(circle1);

        Circle circle2 = new Circle(center2, 5.5);

        System.out.println("Should be printed false");
        System.out.println(circle2.compare(circle1));
    }
}
