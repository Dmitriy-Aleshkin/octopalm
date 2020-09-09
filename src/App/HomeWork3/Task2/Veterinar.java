package App.HomeWork3.Task2;

public class Veterinar {
    public static void main(String[] args) {
        Veterinar veterinarian = new Veterinar();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Каша и кости", "Двор частного дома");
        animals[1] = new Cat("Молоко и рыба", "Квартира");
        animals[2] = new Horse("Сено", "Конюшня", 34);
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
    public void treatAnimal(Animal animal) {
        System.out.println(animal);
    }
}