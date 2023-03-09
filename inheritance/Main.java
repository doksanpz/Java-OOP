package inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.eat();
        puppy.bark();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
