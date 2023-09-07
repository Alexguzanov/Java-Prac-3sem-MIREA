public class Circle {
    private Point center = new Point(0.0, 0.0);
    private double radius = 1.0;

    public Circle(Point point, double radius){
        this.center = point;
        this.radius = radius;
    }
    public Circle(){

    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Point getCenter(){
        return this.center;
    }

    public void setCenter(Point point){
        this.center = point;
    }

    public double getLength(){
        return this.radius * Math.PI  * 2;
    }

    public double getSquare(){
        return (this.radius * this.radius) * Math.PI;
    }

    public boolean compare(Circle anotherCircle){
        if (this.radius > anotherCircle.radius){
            return true;
        }
        else{
            return false;
        }
    }


    @Override
    public String toString(){
        return "Radius: " + String.valueOf(this.radius) + "\n" + "Center : " + "\n" + String.valueOf(this.center);
    }
}
