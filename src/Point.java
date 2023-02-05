public class Point{
    private double x, y;

    Point(){ }
    Point(double x, double y){
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point a){
        return  Math.sqrt(Math.pow((a.getX() - getX()), 2) + Math.pow((a.getY() - getY()), 2));
    }

}