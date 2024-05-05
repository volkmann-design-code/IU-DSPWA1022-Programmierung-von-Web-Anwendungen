package challenges.Animals;

public abstract class Bird extends Animal {

    public Bird(String species, boolean isExtinct) {
        super(species, "Birds", isExtinct);
    }

    public abstract void fly();

    public abstract void layEggs();

}
