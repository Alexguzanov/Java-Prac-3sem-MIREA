public class Tester {
    public static void main(String[] args){

        int n = 10;
        Circle[] circles = new Circle[n];

        Point center = new Point(4.0, 10.0);

        Circle circle1 = new Circle();
        circle1.setCenter(center);
        circle1.setRadius(5.0);
        circles[0] = circle1;

        System.out.println(circles[0]);

    }
}
