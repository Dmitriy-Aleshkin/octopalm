package App.HomeWork4.Task1;

//square = Math.sqrt(p*(p-x)*(p-y)*(p-z))
public class Triangle implements Shape {
    double p;
    double x;
    double y;
    double z;

    public Triangle (double p, double x, double y, double z) {
        this.p = p;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getP () {
        return this.p;
    }
    public double getX () {
        return this.x;
    }
    public double getY () {
        return this.y;
    }
    public double getZ () {
        return this.z;
    }
    @Override
    public double square() {
        return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
}