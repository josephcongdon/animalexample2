package childClasses;

import abstractClasses.Animal;
import interfaceExamples.AnimalActions;

public class Cat extends Animal implements AnimalActions {


    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("chew");
    }
}
