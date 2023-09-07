public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball();
        ball.setXY(2.2, 3.45);
        System.out.println(ball);
        ball.move(3, 4);
        System.out.println(ball);
    }
}
