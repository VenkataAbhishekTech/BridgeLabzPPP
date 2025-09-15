class Animal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
public class StaticPolymorphismAnimal {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); 
        myCat.sound();
    }
}
