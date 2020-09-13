package App.HomeWork4.Task1;

//square = x*y
public class Rectangle implements Shape {
    double x;
    double y;

    public Rectangle (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX () {
        return this.x;
    }
    public double getY () {
        return this.y;
    }
    @Override
    public double square() {
        return x*y;
    }
}
