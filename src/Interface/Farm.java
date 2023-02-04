package Interface;

public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal();
        animals[1] = new Pig("Prosiaczek");
        animals[2] = new Pig("Pepa");
        animals[3] = new Dog("Burek");
        animals[4] = new Cat("Filemon");

        for (Animal animal : animals) {
            animal.introduce();
        }

    }
}
