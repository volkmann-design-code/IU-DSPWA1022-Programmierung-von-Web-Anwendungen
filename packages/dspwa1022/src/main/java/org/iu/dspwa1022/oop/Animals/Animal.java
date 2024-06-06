package org.iu.dspwa1022.oop.Animals;

public abstract class Animal {

    final String species;
    final String biologicalClass;
    final boolean isExtinct;

    protected Animal(
            String species,
            String biologicalClass,
            boolean isExtinct) {
        this.species = species;
        this.biologicalClass = biologicalClass;
        this.isExtinct = isExtinct;
    }

    public abstract void makeSound();

    public static boolean canSwim(Animal animal) {
        return (animal instanceof Fish) || (animal instanceof Whale) || (animal instanceof Penguin);
    }

    public static boolean canFly(Animal animal) {
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            return !(bird instanceof Penguin);
        }
        return false;
    }

    public static int amountOfLegs(Animal animal) {
        if (animal instanceof Bird) {
            return 2;   
        } else if (animal instanceof Fish) {
            return 0;
        } else{
        return 4;}
    }

}
