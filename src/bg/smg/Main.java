package bg.smg;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Frog frog = new Frog();

        AnimalHouse<Animal> animalHouse = new AnimalHouse<Animal>();
        animalHouse.animal = cat;
        System.out.println(cat);

        animalHouse.animal = dog;
        System.out.println(dog);

        animalHouse.animal = frog;
        System.out.println(frog);

        AnimalHouse<Dog> dogHouse = new AnimalHouse<Dog>();
        dogHouse.animal = dog;

        System.out.println(dog);

        AnimalHouse<Cat> catHouse = new AnimalHouse<Cat>();
        catHouse.animal = cat;
        System.out.println(cat);

        AnimalHouse<Frog> frogHouse = new AnimalHouse<Frog>();
        frogHouse.animal = frog;
        System.out.println(frog);

    }
}
