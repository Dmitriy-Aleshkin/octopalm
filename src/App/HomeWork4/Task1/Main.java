package App.HomeWork4.Task1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(12,4,6,9); //square = Math.sqrt(p*(p-x)*(p-y)*(p-z))
        shape[1] = new Circle(11); //square = pi*(r*r)
        shape[2] = new Rectangle(25,48);
        for (Shape sh: shape){
            System.out.println("Пощадь фигуры: "+ sh.square());
        }
    }
}