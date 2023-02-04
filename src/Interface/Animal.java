package Interface;

public class Animal {
    String name;

    public Animal() {
        this.name = "bezimienne";
    }

    String showName(){
        return "zwierze " + name;
    }

    String makeSound(){
        return "???";
    }

    void introduce(){
        System.out.println("Jestem " + showName() + ":" + makeSound());
    }

}
