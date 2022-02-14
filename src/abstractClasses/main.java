package abstractClasses;

import childClasses.Cat;
import childClasses.Dog;

public class main {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeNoise();

        Dog myDog = new Dog();
        myDog.makeNoise();
    }

}
