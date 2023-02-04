package Interface;

public class Pig extends Animal{
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Świnka " + name;
    }

    @Override
    String makeSound() {
        return "hrum hrum";
    }
}


