package App.HomeWork4.Task1;
//square = pi*(r*r1)
public class Circle implements Shape {
    double pi = Math.PI;
    double r;

    public Circle (double r) {
        this.r = r;
    }
    public double getPi () {
        return this.pi;
    }
    public double getR () {
        return this.r;
    }
    @Override
    public double square() {
        return pi*(r*r);
    }
}
