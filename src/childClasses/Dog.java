package childClasses;

import abstractClasses.Animal;
import interfaceExamples.AnimalActions;

public class Dog extends Animal implements AnimalActions {
    @Override
    public void makeNoise() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("Scarf");
    }
}
