package Interface;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}
