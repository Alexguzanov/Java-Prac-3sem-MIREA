public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(){

    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString(){
        return "X: " + String.valueOf(this.x) + "\n" + "Y: " + String.valueOf(this.y);
    }
}
