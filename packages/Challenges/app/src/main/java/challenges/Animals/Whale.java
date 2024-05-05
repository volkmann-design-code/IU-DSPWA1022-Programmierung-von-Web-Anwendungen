package challenges.Animals;

public class Whale extends Mammal {

    public Whale() {
        super("Whale", false);
    }

    @Override
    public void makeSound() {
        System.out.println("Whale sounds");
    }

}
