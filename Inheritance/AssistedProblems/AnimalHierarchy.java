package Inheritance.AssistedProblems;
import java.util.Scanner;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Animal (1-Dog, 2-Cat, 3-Bird): ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Animal Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Animal animal;
        switch (choice) {
            case 1:
                animal = new Dog(name, age);
                break;
            case 2:
                animal = new Cat(name, age);
                break;
            case 3:
                animal = new Bird(name, age);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        animal.displayDetails();
        animal.makeSound();
        sc.close();
    }
}
