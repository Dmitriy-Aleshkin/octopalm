package App.HomeWork4.Task2;

public class Main {
    public static void main(String[] args) {
        Engine V8 = new Engine("Hemi", 196);
        Engine W12 = new Engine("GrageMontage", 872);
        Lorry Gazel = new Lorry("GAZ", "Gruzovichek", 4508.52, V8, 1523.3 );
        SportCar Audi = new SportCar("RS6", "Avant", 2150.11, W12, 1123);

        Gazel.printInfo();
        Gazel.start();
        Gazel.turnLeft();
        Gazel.stop();

        Audi.printInfo();
        Audi.start();
        Audi.turnRight();
        Audi.stop();
    }
}
